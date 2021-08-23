package com.lao.Collections;

import java.util.HashMap;

public class HashmapNoofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Testing";
		//str = str.toUpperCase();
				System.out.println("Length" +str.length());
				System.out.println("Charat" +str.charAt(0));
		
		String[] split = str.split("");
		HashMap<Character,Integer> data = new HashMap<Character,Integer>();

		
		//data.containsKey(data);
		
		//System.out.println(split.length);
		
		for(int i=0; i<str.length(); i++)
		{
			if(data.containsKey(str.charAt(i)))
			{
				int count=data.get(str.charAt(i));
				//System.out.println(data.get(split[i]));
				//System.out.println("Count Value before "+count);
				data.put(str.charAt(i), count+1);
				//System.out.println(data);
				
			}
			else
			{
				data.put(str.charAt(i),1);
				//System.out.println(data);
				
			}
			
		}
	System.out.println(data);
	

	}

}
