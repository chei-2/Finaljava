package testing;

import java.util.Scanner;

public class Numwhichdivby10withoutrem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		//Scanner pool = new Scanner(System.in);
		//System.out.println("enter the number to be performed :\t");
		//int n=pool.nextInt();
		for(int i=0;i<101;i++) {
			if(i%10==7) {
				continue;
			}
			else {
				System.out.println(i);
			}
			
		}
		

	}

}
