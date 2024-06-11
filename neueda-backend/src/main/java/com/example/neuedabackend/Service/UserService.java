package com.example.neuedabackend.Service;

import com.example.neuedabackend.Model.Stock;
import com.example.neuedabackend.Model.User;

public class UserService {

    public void buyStock(User user, Stock stock){

        user.addStock(stock);
    }

    public void sellStock(User user, Stock stock){
        user.removeStock(stock);
    }

}
