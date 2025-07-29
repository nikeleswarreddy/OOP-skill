package Skill1;
import java.util.Scanner;
public class program2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double a;
		a=sc.nextDouble();
		int b;
		b=(int)a;
		System.out.println("before conversion a: "+a);
		System.out.println("After conversion a: "+b);
		sc.close();
	}
}