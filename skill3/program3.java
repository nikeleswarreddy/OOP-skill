package skill3;
import java.util.Scanner;
public class program3 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int sqrt=(int)Math.sqrt(n);
	if(sqrt*sqrt==n)
	{
		System.out.println("it is a perfect square");
	}
	else
	{
		System.out.println("not a perfect square");
	}
	sc.close();
}
}
