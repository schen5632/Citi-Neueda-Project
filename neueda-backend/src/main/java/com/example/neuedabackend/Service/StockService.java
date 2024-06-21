package com.example.neuedabackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.neuedabackend.Model.Stock;
import com.example.neuedabackend.Repository.StockRepository;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllStocks(){
        return stockRepository.findAll();
    }

    public List<Stock> getStocksByName(String name){
        return stockRepository.findByName(name);
    }


}
