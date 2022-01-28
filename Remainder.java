package testing;

import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object = new Scanner(System.in);
		System.out.println("enter the number to be performed :\t");
		int num=object.nextInt();
		int s=num%3,t=num%7, u=num%17, v=num%25;
		int output=s+t+u+v;
		System.out.println(output);
		if (output%2==0) {
			System.out.println("summ of rem is even");
		}
		else {
			System.out.println("sum of rem is odd");
		}
	}
}
