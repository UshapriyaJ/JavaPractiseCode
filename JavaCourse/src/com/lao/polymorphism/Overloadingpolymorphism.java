package com.lao.polymorphism;

public class Overloadingpolymorphism {

		int family(int a, int b)
		{
			return a+b;
		}
		
		int family(int a,int b,int c)
		{
			return a+b+c;
		}
				
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Overloadingpolymorphism data = new Overloadingpolymorphism();
			System.out.println(data.family(2,3));
			System.out.println(data.family(2,3,4));
					}

	}

