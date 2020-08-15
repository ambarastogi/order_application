package com.sapient.automation;

public class Application {

	public static void main(String[] args) {
		System.out.println("Amba");
		
		Animal cow = new Animal("cow", 4, "white");
		Animal dog = new Animal("dog", 4, "black");
		
		System.out.println("Cow Legs ="+cow.numberOfLegs());
		System.out.println("Cow Name ="+cow.animalName());
		System.out.println("Cow Color ="+cow.color());
		
		System.out.println("Dog Legs ="+dog.numberOfLegs());
		System.out.println("Dog Name ="+dog.animalName());
		System.out.println("Dog Color ="+dog.color());
		
	}

}
