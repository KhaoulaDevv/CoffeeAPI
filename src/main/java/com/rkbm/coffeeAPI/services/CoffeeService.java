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
		
		// Initialize starting list
        coffees.addToListCoffees(new CoffeeModel(1, "Espresso", baseURL + "/images/espresso.webp"));
        coffees.addToListCoffees(new CoffeeModel(2, "Latte", baseURL + "/images/latte.webp"));
        coffees.addToListCoffees(new CoffeeModel(3, "Cappuccino",baseURL + "/images/cappuccino.webp"));

    }

    public Coffees getAllCoffees() {
	
        return coffees;
    }
    /*
    public CoffeeModel addCoffee(CoffeeModel coffee) {
        coffees.add(coffee);
        return coffee;
    }

    public boolean removeCoffee(int id) {
        Optional<CoffeeModel> coffee = coffees.stream()
                .filter(c -> c.getId() == id)
                .findFirst();
        coffee.ifPresent(coffees::remove);
        return coffee.isPresent();
    }
    */
}
