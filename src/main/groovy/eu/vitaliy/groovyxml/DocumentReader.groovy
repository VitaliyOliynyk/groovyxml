package eu.vitaliy.groovyxml

class DocumentReader {

    private String fileName


    static DocumentReader newInstance(String fileName){
          return new DocumentReader(fileName: fileName)
    }

    void read(){
        def xml = new XmlSlurper().parse(fileName)
        xml.item.each { item ->
            println "${item.name},  ${item.@qty}, ${item.type}"
        }

    }
}
