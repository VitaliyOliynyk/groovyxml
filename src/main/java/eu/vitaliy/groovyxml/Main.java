package eu.vitaliy.groovyxml;

public class Main {

    public static void main(String[] args){

        String fileName = "target/test.xml";

        //Create document
        DocumentCreator documentCreator = DocumentCreator.newInstance(fileName);
        documentCreator.createDokument();


        //Read document
        DocumentReader documentReader = DocumentReader.newInstance(fileName);
        documentReader.read();
    }
}
