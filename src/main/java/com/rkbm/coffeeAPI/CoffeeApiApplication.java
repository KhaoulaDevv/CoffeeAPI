package com.rkbm.coffeeAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class CoffeeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeApiApplication.class, args);
	}

}
