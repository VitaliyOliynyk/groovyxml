package eu.vitaliy.groovyxml

import groovy.xml.MarkupBuilder

class DocumentCreator {

    private String fileName
    
    static DocumentCreator newInstance(String filename){
        return new DocumentCreator(fileName: filename)
    }


    void createDokument() {
        def file = new File(fileName)
        
        def markupBuilder = new MarkupBuilder(new FileWriter(file))
        
        def objs = [
                [quantity: 10, name: "Orange", type: "Fruit"],
                [quantity: 6, name: "Apple", type: "Fruit"],
            ]

        markupBuilder.root {
            objs.each { o ->
                item(qty: o.quantity) {
                    name(o.name)
                    type(o.type)
                }
            }
        }

    }
}
