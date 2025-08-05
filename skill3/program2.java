package skill3;
import java.util.Scanner;
public class program2 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int a=0,b=1,next;
	for(int i=0;i<n;i++)
	{
		System.out.println(" "+a);
		next=a+b;
		a=b;
		b=next;
	}
	sc.close();
}
}
