package com.example.neuedabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.neuedabackend.Model.Stock;
import com.example.neuedabackend.Model.User;


@SpringBootApplication
@RestController
public class NeuedaBackendApplication {
	// mongo link: mongodb+srv://schen5632:<password>@cluster0.z8ctfzq.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0
	public static void main(String[] args) {
		SpringApplication.run(NeuedaBackendApplication.class, args);

		User user = new User("user1", "1234");
		Stock citi = new Stock("Citi", "CIT", 20);
		Stock citi2 = new Stock("Citi", "CIT", 20);
		Stock amazon = new Stock("Amazon", "AMZ", 30);

		System.out.println(user.getUsername()+" "+ user.getStocks());
		
		user.addStock(citi);
		user.addStock(amazon);
		user.addStock(citi2);
		

		System.out.println(user.getUsername() + " " + user.getStocks());
		for (Stock s: user.getStocks()){
			System.out.println(s.getName()+ " "+ s.getPrice() + " " + s.getTicker());

		}
		System.out.println("Sell Citi:");
		user.removeStock(citi);
		user.removeStock(citi);

		for (Stock s: user.getStocks()){
			System.out.println(s.getName()+ " "+ s.getPrice() + " " + s.getTicker());

		}

	}


}
