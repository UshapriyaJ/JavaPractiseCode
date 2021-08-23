package com.lao.polymorphism;

public class Overridingchild extends OveridingParent {
	
	@Override
	public void sub()
	{
		System.out.println("I am from child class whom I am overriding the method of parent");
	}
	public static void main(String[] args)
	{
		OveridingParent data = new Overridingchild();
		data.sum();
		data.sub();
	}

}
