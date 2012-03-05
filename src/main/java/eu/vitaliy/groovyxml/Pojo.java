package eu.vitaliy.groovyxml;
public class Pojo {

    private String name;
    private String type;
    private int quantity;

    public Pojo(String name, String type, int quantity) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
