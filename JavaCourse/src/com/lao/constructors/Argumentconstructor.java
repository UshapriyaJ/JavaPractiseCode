package com.lao.constructors;

public class Argumentconstructor {

	String animal_name;
	String Animal_Category;
	Argumentconstructor(String name, String category)
	{
		animal_name = name;
		Animal_Category = category;
	}
	
	public void grouping()
	{
		System.out.println("I am " +animal_name +"I belong to the category of " + Animal_Category);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Argumentconstructor group1 = new Argumentconstructor("Crocodile","Reptiles");
		group1.grouping();
		Argumentconstructor group2 = new Argumentconstructor("Allegator","Reptiles");
		group2.grouping();
	}

}
