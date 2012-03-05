package eu.vitaliy.groovyxml

import groovy.xml.MarkupBuilder

class DocumentCreator {

    private String fileName

    static DocumentCreator newInstance(String filename) {
        return new DocumentCreator(fileName: filename)
    }


    void createDokument(Pojo ... fruits) {
        def file = new File(fileName)

        def markupBuilder = new MarkupBuilder(new FileWriter(file))

        markupBuilder.root {
            fruits.each { o ->
                item(qty: o.quantity) {
                    name(o.name)
                    type(o.type)
                }
            }
        }
    }
}
