package com.example.victoryvista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication(scanBasePackages = "com.example.victoryvista")
public class VictoryVistaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VictoryVistaApplication.class, args);
	}

}
