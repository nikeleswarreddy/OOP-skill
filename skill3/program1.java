package skill3;
import java.util.Scanner;
public class program1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int units;
	System.out.println("enter the number of units used");
	units=sc.nextInt();
	if(units>=51 && units<=100)
	{
		System.out.println("the bill is: "+units*3);
	}
	else if(units>=101 && units<=300)
	{
		System.out.println("the bill is: "+units*5);
	}
	else if(units>=301 && units<=450)
	{
		System.out.println("The bill is: "+((units*6)+200));
	}
	else 
	{
		System.out.println("The bill is: "+((units*8)+250));
	}
	sc.close();
}
}
