package com.jimmycheng.study;

public class Stock {

    private String name;

    public Stock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        System.out.println("User should not call this in unit testing!");
        return 1.0;
    }
    
    public void displayStockinfo(){
    }
    
}