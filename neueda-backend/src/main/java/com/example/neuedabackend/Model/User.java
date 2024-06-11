package com.example.neuedabackend.Model;

import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private ArrayList<Stock> stocks;

    

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
