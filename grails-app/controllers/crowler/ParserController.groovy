package crowler




class ParserController {
    def myJavaFunction

    def index() {
        def file = new File("/Users/leonardogloria/Documents/Projetos/output.txt")
        def fileOutput = new File("/Users/leonardogloria/Documents/Projetos/output2.txt")

        file.eachLine {
            def line = it.split(" ")
            fileOutput << line[0] + "\n"

        }

    }
    def sendGet(){
        myJavaFunction.getHttpsRequest2()
        println "teste"


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
