package com.lao.constructors;

public class Argconstructor {
	String Mtree,Mfruit;
	
	Argconstructor(String Tree,String Fruit) {
		Mtree = Tree;
		Mfruit = Fruit;
	}
	
	public void tagging()
	{
		System.out.println("This tree name is " +Mtree + " and gives fruit called" +Mfruit);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Argconstructor data = new Argconstructor("Mango","Fruit");
		data.tagging();
	}

}
