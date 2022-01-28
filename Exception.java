package testing;

public abstract class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			int a=100;
			int n=75;
			int d=5;
			for (int i=0;i<=n;i=i+d) {
				System.out.println((float)(a/(n-i)));
				}
			System.out.println("hi");
			System.exit(2);

		}
		catch(ArithmeticException chait)
		{
			System.out.println("chaitu its an error....... and it's an "+chait);
			
		}
		finally
		{
			System.out.println("finally block executed");
		}
	}

}
