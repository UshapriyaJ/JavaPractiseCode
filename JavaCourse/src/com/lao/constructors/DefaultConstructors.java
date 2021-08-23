package com.lao.constructors;

public class DefaultConstructors {
	
	//All the class datatype will return the default value as NULL
	Integer amount;
	String name;
	// All the normal datatype will return based on the data type.
	int rupees;
	
	public static void main(String[] args) {
		DefaultConstructors data = new DefaultConstructors();
		System.out.println(data.amount);
		System.out.println(data.rupees);
		System.out.println(data.name);
	}
}
