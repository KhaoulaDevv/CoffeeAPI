package com.rkbm.coffeeAPI.services;

import org.springframework.stereotype.Service;

import com.rkbm.coffeeAPI.models.CoffeeModel;
import com.rkbm.coffeeAPI.models.Coffees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class CoffeeService {

	private final Coffees coffees = new Coffees();
	private final String baseURL = "http://192.168.1.50:8080";

	public CoffeeService() {

		coffees.addToListCoffees(new CoffeeModel(1, "Espresso", baseURL + "/images/espresso.webp",
				"Préparez un espresso en utilisant une machine à café espresso avec une mouture fine de café. Versez environ 30 ml de café dans une tasse."));
		coffees.addToListCoffees(new CoffeeModel(2, "Cappuccino", baseURL + "/images/cappuccino.webp",
				"Préparez un espresso et faites chauffer du lait à la vapeur jusqu'à ce qu'il devienne mousseux. Mélangez l'espresso avec le lait mousseux et ajoutez un peu de lait chaud sur le dessus."));
		coffees.addToListCoffees(new CoffeeModel(3, "Latte", baseURL + "/images/latte.webp",
				"Préparez un espresso, puis ajoutez une grande quantité de lait chaud. Mélangez bien pour obtenir une texture crémeuse."));
		coffees.addToListCoffees(new CoffeeModel(4, "Americano", baseURL + "/images/americano.jpeg",
				"Préparez un espresso, puis ajoutez de l'eau chaude pour diluer le café à votre goût."));
		coffees.addToListCoffees(new CoffeeModel(5, "Mocha", baseURL + "/images/mocha.png",
				"Préparez un espresso, puis ajoutez du chocolat chaud et une petite quantité de lait mousseux. Mélangez bien et décorez avec de la crème chantilly."));

	}

	public Coffees getAllCoffees() {

		return coffees;
	}
	/*
	 * public CoffeeModel addCoffee(CoffeeModel coffee) { coffees.add(coffee);
	 * return coffee; }
	 * 
	 * public boolean removeCoffee(int id) { Optional<CoffeeModel> coffee =
	 * coffees.stream() .filter(c -> c.getId() == id) .findFirst();
	 * coffee.ifPresent(coffees::remove); return coffee.isPresent(); }
	 */
}
