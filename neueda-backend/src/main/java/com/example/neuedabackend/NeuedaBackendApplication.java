package com.example.neuedabackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.neuedabackend.Model.Stock;
import com.example.neuedabackend.Model.User;
import com.example.neuedabackend.Repository.StockRepository;


@SpringBootApplication
@RestController
public class NeuedaBackendApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(NeuedaBackendApplication.class, args);


		//TEST
		/* User user = new User("user1", "1234");
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
 */
	}

	//use this to save some stocks to h2 database upon app startup
	@Bean
	public CommandLineRunner demo(StockRepository stockRepository){
		return(args) -> {

			//save some stocks
			stockRepository.save(new Stock("Citibank", "CITI", 33, 1));
			stockRepository.save(new Stock("Apple", "APPL", 30, 1));
			
		};
	}


}
