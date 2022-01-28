package testing;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		Scanner object = new Scanner(System.in);
		System.out.println("enter the number to be performed to check if its palindrome:\t");
		int num=object.nextInt();
		int asdf=num;
		while(num>0)
		{
		int news=num%10;
		rev=(rev*10)+news;
	    num=num/10;
	    }
		if(rev==asdf) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
