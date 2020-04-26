package com.company;

public class Tobacco implements Visitable{

    private double price;


    private String description;

    public Tobacco(double price,String description) {
        this.price = price;
        this.description=description;
    }

    public double getPrice() {
        return price; }

    public String getDescription(){
        return description; }

    @Override
    public String accept(Visitor visitor){
        return visitor.visit(this);

    }

}
