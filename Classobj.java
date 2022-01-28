package testing;

class Classcbj {
	int i,j;

	public Classcbj(int k, int l) {
		// TODO Auto-generated constructor stub
	}

	/*public Classobj(int i, int j) {
		//super();
		this.i = i;
		this.j = j;
	}*/

	void display(){
		//ODO Auto-generated constructor stub
			System.out.println("sum of  "+(i)+"  and  "+(j)+"  is  "+(i+j));
			System.out.println("sub of  "+(i)+"  and  "+(j)+"  is  "+(i-j));
		}

}
/*	public int car(int a,int b) {
		// TODO Auto-generated method stub
		int d=a+b;
		System.out.println(d);
		return d;
	    }*/
class Classbbj{
	int i,j;
	
		public Classbbj(int i, int j) {
		//super();
		//this.i = i;
		//this.j = j;
	}
		void display() {
		//ODO Auto-generated constructor stub
			System.out.println("div of  "+(i)+"  and  "+(j)+"  is  "+(i/j));
			System.out.println("mul of  "+(i)+"  and  "+(j)+"  is  "+(i*j));
		}
}
	
	
public class Classobj{
public static void main(String[] args) {
	Classbbj ob1 = new Classbbj(2, 3);
			Classcbj obj1 =new Classcbj(10,18);
			Classbbj obj2 =new Classbbj(100,180);	
		ob1.display();
		obj1.display();
		obj2.display();
			
	}
	
}

