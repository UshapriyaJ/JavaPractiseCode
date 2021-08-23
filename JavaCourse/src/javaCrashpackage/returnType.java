package javaCrashpackage;

public class returnType {
Integer amount =80;

//Return type should be the same data type;
public Integer son()
{
System.out.println("Daddy i got the amount of " +amount);
return amount;
}
public static void main(String[] args) {

	returnType myson= new returnType();
	Integer amount= myson.son();
	System.out.println("Got the amount son " +amount);
	}

}
