package com.sapient.automation;

public class Animal {

	String name; // cow,lion,
	int numberOfLeg;
	String color;
	String animalFood;

	public Animal(String nameOfAnimal,int legOfAnimal,String colorOfAnimal) {
		name=nameOfAnimal;
		numberOfLeg=legOfAnimal;
		color=colorOfAnimal;
	}
	
	public String animalName() {
		return this.name;
	}

	public String numberOfLegs() {
		return String.valueOf(numberOfLeg);
	}
	
	public String color() {
		return this.color;
	}
	
	

}
