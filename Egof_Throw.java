package testing;

import java.util.Scanner;

public class Egof_Throw {
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner prabhu=new Scanner(System.in);
		System.out.println("enter a num  :");
		int a =prabhu.nextInt();
		if(a>17)
		{
			System.out.println("candidate is eligible");
		}
		else
		{
			throw new NullPointerException("not eligible");
			
		}
		prabhu.close();
	}//prabhu.close();
}
		

