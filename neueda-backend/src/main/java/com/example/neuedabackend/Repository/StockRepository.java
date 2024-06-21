package com.example.neuedabackend.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.neuedabackend.Model.Stock;


public interface StockRepository extends JpaRepository<Stock, Long> {

    List<Stock> findByName(String name);

}
