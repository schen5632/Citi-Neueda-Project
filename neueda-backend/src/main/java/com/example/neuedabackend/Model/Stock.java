package com.example.neuedabackend.Model;

public class Stock {

    private double price;
    private String ticker;
    private String name;
    int shares;





    public Stock(String name, String ticker, double price) {
        this.name = name;
        this.ticker = ticker;
        this.price = price;
        this.shares = 0;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }
     public void addShares(int shares){
        this.shares += shares;
    }
    public void sellShares(int shares){
        this.shares -= shares;
    } 

    public String getTicker() {
        return ticker;
    }
    public void setTicker(String ticker) {
        this.ticker = ticker;
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

    

}
