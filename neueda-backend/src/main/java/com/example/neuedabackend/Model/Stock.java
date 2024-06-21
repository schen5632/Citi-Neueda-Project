package com.example.neuedabackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double price;
    private String ticker;
    private String name;
    private int shares;



    public Stock(){}


    public Stock(String name, String ticker, double price, int shares) {
        this.name = name;
        this.ticker = ticker;
        this.price = price;
        this.shares = shares;
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
