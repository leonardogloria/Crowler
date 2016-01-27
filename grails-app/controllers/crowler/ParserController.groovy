package crowler

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import teste.HttpGetter


class ParserController {
    def myJavaFunction

    def index() {
        def file = new File("/Users/leonardogloria/Documents/Projetos/output.txt")
        def fileOutput = new File("/Users/leonardogloria/Documents/Projetos/outputfinal.txt")

        file.eachLine {
            def line = it.split(" ")
            fileOutput << line[0] + "\n"

        }

    }
    def usingJsoup(){
        def file = new File("/Users/leonardogloria/Documents/Projetos/outcurto.txt")
        def fileOutput = new File("/Users/leonardogloria/Documents/Projetos/outputFabricantes.txt")

        file.eachLine {

            def stf=  myJavaFunction.getHttpsRequest2(it.toString())
            Document document =  Jsoup.parse(stf.toString())

            def elements= document.select("#container_content")
            fileOutput << elements.text() + "\n"
        }

//
//        def stf=  myJavaFunction.getHttpsRequest2("12069")
//        Document document =  Jsoup.parse(stf.toString())
//
//        def elements= document.select("#container_content")
//        println elements.text()


    }
    def sendGet(){
        HttpGetter getter = new HttpGetter();
        def stringHtml = getter.getHttpsRequest2("12069")
        //def stf=  myJavaFunction.getHttpsRequest2("12069")
//        stf.replace("--", " ")
//        println stf
//        def sluper = new XmlSlurper()
//        sluper.setFeature("http://apache.org/xml/features/disallow-doctype-decl",false)
//        def htmlParser = sluper.parseText(stf.toString())
//
//        htmlParser.'**'.findAll{
//            it.@class == 'head'}.each { println it}
        def teste = new XmlSlurper().parseText(stringHtml.toString())
        teste.setFeature("http://apache.org/xml/features/disallow-doctype-decl",false)

        def elements = teste.body.findAll{
            println it
        }



       }



    def getContent( ){




//        try {
//            def ret = null
//            def http = new HTTPBuilder("https://consultaca.com")
//
//            // perform a POST request, expecting TEXT response
//            http.request(Method.GET , ContentType.TEXT) {
//                uri.path = "/fabricantes/1106"
//
//                headers.'User-Agent' = 'Mozilla/5.0 Ubuntu/8.10 Firefox/3.0.4'
//
//                // response handler for a success response code
//                response.success = { resp, reader ->
//                    println "response status: ${resp.statusLine}"
//                    println 'Headers: -----------'
//                    resp.headers.each { h ->
//                        println " ${h.name} : ${h.value}"
//                    }
//
//                    ret = reader.getText()
//
//                    println 'Response data: -----'
//                    println ret
//                    println '--------------------'
//                }
//            }
//            return ret
//
//        } catch (groovyx.net.http.HttpResponseException ex) {
//            ex.printStackTrace()
//            return null
//        } catch (java.net.ConnectException ex) {
//            ex.printStackTrace()
//            return null
//        }
//        def http =       new HTTPBuilder( 'https://consultaca.com/fabricantes/1106' )
//
//        http.request(GET,TEXT) { req ->
//            uri.path = '/mail/help/tasks/' // overrides any path in the default URL
//            headers.'User-Agent' = 'Mozilla/5.0'
//
//            response.success = { resp, reader ->
//                assert resp.status == 200
//                println "My response handler got response: ${resp.statusLine}"
//                println "Response length: ${resp.headers.'Content-Length'}"
//                System.out << reader // print response reader
//            }
//
//            // called only for a 404 (not found) status code:
//            response.'404' = { resp ->
//                println 'Not found'
//            }
//        }

    }


}
