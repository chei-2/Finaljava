package testing;

import java.util.Scanner;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner chai2=new Scanner(System.in);
		System.out.println("enter a number");
		int guru =chai2.nextInt();
		assert  (guru<10):("entered a wrong number");
		{
			System.out.println("good number");
		}chai2.close();
		
	}

}
