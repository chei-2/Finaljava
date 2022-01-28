package testing;
import java.util.Scanner;
public class Test02 {
	
	public static void main(String[] args)
	{
		Scanner chai=new Scanner(System.in);
		System.out.println("enter the input");
		int marks=chai.nextInt();
		//int marks;
		
		if (marks>69)
		{ System.out.println("pass");}
		else
		{ System.out.println("fail");}
	}
}
