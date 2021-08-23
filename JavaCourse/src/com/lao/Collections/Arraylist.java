package com.lao.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> Data = new ArrayList<Integer>();
		Data.add(100);
		Data.add(200);
		Data.add(300);
		Data.add(400);
		System.out.println(Data);
		System.out.println(Data.size());
		System.out.println(Data.contains(300));
		System.out.println("Advanced For Loop");
		//For(Datatype Object:Array|Collection)
		for(Integer Data1:Data)
		{
			System.out.println(Data1);
		}
		System.out.println("Iterator forward");
		ListIterator<Integer> Itr = Data.listIterator();
		{
			while(Itr.hasNext())
			{
			System.out.println(Itr.next());	
			}
		}
		
		System.out.println(" For loop");
		{
			for(int i=0 ; i<=Data.size(); i++)
			{
				System.out.println(Data.get(i));
			}
		}
		System.out.println("Iterator backward");
		ListIterator<Integer> Itr2 = Data.listIterator();
		{
			while(Itr2.hasPrevious())
			{
				System.out.println(Itr2.previous());
			}
		}
		
		
	}
	
}
