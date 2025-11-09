package com.rkbm.coffeeAPI.controllers;

import com.rkbm.coffeeAPI.models.CoffeeModel;
import com.rkbm.coffeeAPI.models.Coffees;
import com.rkbm.coffeeAPI.services.CoffeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

	@Autowired
	private CoffeeService coffeeService;

	@GetMapping("listAll")
	public Coffees getAllCoffees() {

		

		return coffeeService.getAllCoffees();
	}

	/*
	 * @PostMapping public CoffeeModel addCoffee(@RequestBody CoffeeModel coffee) {
	 * return coffeeService.addCoffee(coffee); }
	 * 
	 * @DeleteMapping("/{id}") public String deleteCoffee(@PathVariable int id) {
	 * boolean removed = coffeeService.removeCoffee(id); return removed ?
	 * "Coffee removed successfully" : "Coffee not found"; }
	 * 
	 */
}
