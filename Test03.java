package testing;
import java.util.Scanner;

public class Test03 {
	int i;  
    static int arr[];
    static Scanner prabhu=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			
			System.out.println("give the input and press enter for 3 times");
			arr[i]  =(int) prabhu.nextInt();
			
		}
				
		
		//int a=12,b=94,c=6;
		if ((arr[0]>arr[1])&&(arr[0]>arr[2])) {
			System.out.println(arr[0]+ " is bigger");
		}
		if ((arr[1]>arr[2])&&(arr[1]>arr[0])) 
		{
			System.out.println(arr[1]+ " is bigger");
			
		}
		if ((arr[2]>arr[1])&&(arr[2]>arr[0]))
		{
			System.out.println(arr[2]+ " is bigger");
		}
		else {
			System.out.println("i m stupid but not that enough");
			}

}}
