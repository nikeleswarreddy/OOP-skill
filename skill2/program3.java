package skill2;
import java.util.Scanner;
public class program3 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first string");
	String a=sc.nextLine();
	StringBuilder sb=new StringBuilder(a);
	System.out.println("Enter the second string");
	String b=sc.nextLine();
	sb.append(b);
	System.out.println("The append keyword: "+sb);
	sb.insert(1,"nikel");
	System.out.println("the insert keyword: "+sb);
	sb.replace(0,3,"JAVA");
	System.out.println("the replace keyword: "+sb);
	sb.delete(0, 3);
	System.out.println("the delete keyword is: "+sb);
	sb.reverse();
	System.out.println("the reverse keyword is: "+sb);
	System.out.println("the Capacity keyword is: "+sb.capacity());
	sc.close();
}
}
