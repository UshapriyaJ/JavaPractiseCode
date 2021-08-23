package com.lao.Collections;

import java.util.HashMap;

public class TrialHashMap {
	
	public static void main(String[] args)
	{
	HashMap<String,Integer> data = new HashMap<String,Integer>();
	data.put("I", 1);
	data.put("am", 2);
	data.put("happy", 4);
	data.put("LOL", 4);
	
	System.out.println(data);
	System.out.println(data.get("I"));// I use get method then it return value.
	System.out.println(data.size());
	System.out.println(data.containsKey("I"));
	
	
	}

}

