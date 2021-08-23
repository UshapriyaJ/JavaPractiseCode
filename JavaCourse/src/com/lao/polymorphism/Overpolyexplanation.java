package com.lao.polymorphism;

public class Overpolyexplanation {
	
	public int family(int a, int b)
	{
		System.out.println("I am sum of 2 digit");
		return a+b;
	}
	public int family(int a, int b, int c)
	{
		System.out.println("I am sum of 3 digit");
		return a+b+c;
	}
	public int family(int a, int b, int c , int d)
	{
		System.out.println("I am sum of 4 digit");
		return a+b+c+d;
	}
	
	public static void main(String[] args)
	{
		Overpolyexplanation data = new Overpolyexplanation();
		int Value = data.family(2,2);
		System.out.println(Value);
		Value = data.family(2,2,2);
		System.out.println(Value);
		Value = data.family(2,2,2);
		System.out.println(Value);
	}
}
