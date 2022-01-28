package testing;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		//int var;
		// TODO Auto-generated method stub
		Scanner Guru=new Scanner(System.in);
		System.out.println("how many marks does the student got :\t");
		int var=Guru.nextInt();
		
		if(var==100) {
			System.out.println("A+ Grade");
		}
		else if(var>=90 && var<100) {
			System.out.println("A Grade");
		}
		else if(var<90 && var>=80) {
			System.out.println("B Grade");
		}
		else if(var<80 && var>=70) {
			System.out.println("c Grade");
		}
		else {
			System.out.println("failed");
		}
		
	}

}
 