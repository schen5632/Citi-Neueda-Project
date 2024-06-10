package com.example.neuedabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NeuedaBackendApplication {
	// mongo link: mongodb+srv://schen5632:<password>@cluster0.z8ctfzq.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0
	public static void main(String[] args) {
		SpringApplication.run(NeuedaBackendApplication.class, args);
	}

}
