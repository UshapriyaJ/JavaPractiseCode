package javacoding;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Primnbrarraylist {

	public static void main(String[] args) 
	{
		ArrayList<Integer> Data = new ArrayList<Integer>();
		
		for(int i=2; i<=100 ; i++) 
		{  boolean isprime = true;
			//for(int factor=2;factor<=i/2 ;factor ++)
			for(int factor=2; (factor<=i/2) & (factor<=7);factor ++)
			{
				if(i %factor == 0)
				{
					isprime = false;
					break;
				}
			}
			if(isprime)
			{
				Data.add(i);
				
			}
			
		}
		/*Iterator<Integer> Data1 = Data.iterator();
		while(Data1.hasNext())
		{
		System.out.println(Data1.next());
		}*/
		for(Integer Data1:Data)
		{
			System.out.println(Data1);
		}
			
	}
}
			
		