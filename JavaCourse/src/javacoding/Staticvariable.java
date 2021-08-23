package javacoding;

public class Staticvariable {
	static int Val=100;
	String Deposit;
	
	
	
	
	public static void main(String[] args)
	{
		Staticvariable data1 = new Staticvariable();
		data1.Val=500;
		data1.Deposit="Mani";
		Staticvariable data2 = new Staticvariable();
		data2.Val=1000;
		data2.Deposit="Mithran";
				
		System.out.println(" Data 1 value is " +data1.Val);
		System.out.println(" Data 1 Deposit is "+data1.Deposit);
		System.out.println(" Data 2 value is "+ data2.Val);
		System.out.println(" Data 1 Deposit is "+data2.Deposit);
	}

}

/*The variable what we declared as static with value will be replaced by the last value of the value */
