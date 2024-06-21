package com.example.neuedabackend.Model;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class User {
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    private String username;
    private String password;
    private ArrayList<Stock> stocks;

    
    public User(){}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.stocks = new ArrayList<Stock>();
        
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public ArrayList<Stock> getStocks() {
        return stocks;
    }
    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public void addStock(Stock stock){        
        this.stocks.add(stock);
    }

    public void removeStock(Stock stock){
        this.stocks.remove(stock);
    }
    
}
