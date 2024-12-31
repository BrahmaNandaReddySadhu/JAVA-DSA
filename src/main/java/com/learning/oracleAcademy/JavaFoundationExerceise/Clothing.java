package main.java.com.learning.oracleAcademy.JavaFoundationExerceise;

public class Clothing {
    private String name;
    private double price;
    private String size;

    public Clothing(String name, double price , String size){
        this.size = size;
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString(){
        return "Name->"+name+ "."+"Price->"+price +"."+"Size->"+size;
    }
}
