/*Method 1:

package javacoding;

public class Stringreverse {

	public static void main(String[] args)
	{
		String S1= "Mani";
		char[] ch=S1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
		System.out.print(ch[i]);
		}

}

}*/

package javacoding;

public class Stringreverse
{
public static void main(String args[])
{
	String Str="Automation";
	StringBuilder data = new StringBuilder(Str);
	data.reverse();
	System.out.println(data);
}
}