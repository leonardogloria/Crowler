package crowler

import grails.converters.JSON

class ParserController {

    def index() {
        def file = new File("/Users/leonardogloria/Documents/Projetos/output.txt")
        def fileOutput = new File("/Users/leonardogloria/Documents/Projetos/output2.txt")

        file.eachLine {
            def line = it.split(" ")
            fileOutput << line[0] + "\n"

        }

    }
    def getContent( ){
        def resp = rest.get("https://consultaca.com/fabricantes/17/")
        println resp


    }
}
