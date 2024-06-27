package com.example.neuedabackend.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.neuedabackend.Model.Stock;
import com.example.neuedabackend.Service.StockService;

@CrossOrigin(origins = {"http://localhost:63342"})
@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/stocks")
    public List<Stock> getAllStocks(){
        return stockService.getAllStocks();
    }

    @GetMapping("stocks/by-name")
    public List<Stock> getStocksByName(@RequestParam(value="name") String name){
        //to test this endpoint: "localhost:8081/stocks/by-name?name=<StockName>" 
        return stockService.getStocksByName(name);
    }
   
}
