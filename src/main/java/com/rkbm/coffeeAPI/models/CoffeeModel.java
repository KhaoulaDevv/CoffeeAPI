package com.rkbm.coffeeAPI.models;

public class CoffeeModel {

	int id;
	String name;
	String imageUrl;
	String instructions;

	// Constructors
	public CoffeeModel() {
	}

	public CoffeeModel(int id, String name, String imageUrl, String instructions) {
		super();
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
		this.instructions= instructions; 
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

}
