package javacoding;

public class Evennumbers {

	public void evenumbers()
	{
		int i;
		for (i=1;i<=25;i++)
			if (i%2==0)  
			{
				System.out.println(i);
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evennumbers data = new Evennumbers();
		data.evenumbers();
	}

}
