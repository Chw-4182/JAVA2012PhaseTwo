package com.demo.bean;

public class Good {
    private String Id;
    private  String name;
    private double price;
    private  String firm;

    public Good() {
    }

    public Good(String id, String name, double price, String firm) {
        Id = id;
        this.name = name;
        this.price = price;
        this.firm = firm;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
}
