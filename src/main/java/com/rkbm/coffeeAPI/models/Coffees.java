package com.rkbm.coffeeAPI.models;

import java.util.ArrayList;
import java.util.List;

public class Coffees {

	List<CoffeeModel> listCoffees;

	public Coffees() {
		super();
		listCoffees= new ArrayList<CoffeeModel>();
	}
	public Coffees(List<CoffeeModel> listCoffees) {
		super();
		this.listCoffees = listCoffees;
	}
	public List<CoffeeModel> getListCoffees() {
		return listCoffees;
	}

	public void setListCoffees(List<CoffeeModel> listCoffees) {
		this.listCoffees = listCoffees;
	}
	
	public void addToListCoffees(CoffeeModel coffee) {
		this.listCoffees.add(coffee);
	}




	
	
	
}
