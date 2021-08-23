package javacoding;

import java.util.Scanner;

public class swap2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		System.out.println("Enter X and Y");
		Scanner data = new Scanner(System.in);
		x= data.nextInt();
		y= data.nextInt();
		System.out.println("Before Swapping " +x+"and" +y);
		x=x+y; //4=4+5 so Now x=9
		y=x-y; //5=9-5 so Now y=4
		x=x-y; //9=9-4	so Now X=5
		
		System.out.println("After Swapping " +x+ "and" +y);
		
		
	}

}
