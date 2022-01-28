package testing;

import java.util.Scanner;

public class Armgstrongnum {

	public static void main(String[] args) {
	 int another;
	do{
		// TODO Auto-generated method stub
		Scanner noodles=new Scanner(System.in);
		System.out.println("enter the num to check for the palindrome:");
		int chopsticks=noodles.nextInt();
		int n = chopsticks,rev=0,s=0,cube,newno;
		while(n>0) {
			newno=n%10;
			cube=newno*newno*newno;
			s=s+cube;
			n=n/10;
			}
		
		if(s==chopsticks) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not an armsteong num");
		}
		System.out.println("want to enter another num press 1");
	    another=noodles.nextInt();
	  }while(another==1);
	}

}
