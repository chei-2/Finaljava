package testing;

import java.util.Scanner;

public class Area {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,l,b,result,r;
		double pie=3.14,output,outs;
		double pointval = 0.5;
		Scanner pool= new Scanner(System.in);
		System.out.println("select an option to perform an action\n1.area of triangle\t2.area of circle\t3.area of square\t4.area of recangle");
		choice=pool.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter length of triangle :\t");
			l=pool.nextInt();
			System.out.println("enter breadth of triangle :\t");
			b=pool.nextInt();
			result=l*b;
			outs=pointval*result;
			System.out.println( "Area of triangle is\t"+outs);
			break;
		case 2:
			System.out.println("enter radius of circle :\t");
			r=pool.nextInt();
			result=r*r;
			output=pie*result;
			System.out.println("Area of circle is\t"+output);
			break;
		case 3:
			System.out.println("enter length of square :\t");
			l=pool.nextInt();
			result=l*l;
			System.out.println("Area of square is\t"+result);
	        break;
		case 4:
			System.out.println("enter length of rectangle :\t");
			l=pool.nextInt();
			System.out.println("enter breadth of rectangle :\t");
			b=pool.nextInt();
			result=l*b;
			System.out.println("Area of recangle is\t"+result);
		    break;
		}
		
	}

}
