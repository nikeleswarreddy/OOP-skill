package Skill1;
import java.util.Scanner;
public class program1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a number");
		a=sc.nextInt();
		long b;
		b=(long)a;
		System.out.println("long value is "+b);
		float c;
		c=(float)a;
		System.out.println("float value is 10"+c);
		sc.close();
	}
}
