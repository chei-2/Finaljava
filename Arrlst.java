package testing;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;

@SuppressWarnings("unused")
public class Arrlst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("hi");
		list1.add("my");
		list1.add("name");
		list1.add("is");
		list1.add("bye");
		
		System.out.println(list1);
		System.out.println(list1.getClass().getSimpleName());
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(01);
		list2.add(0);
		list2.add(1221);
		list2.add(353521);
		list2.add(34641);
		System.out.println(list2);
		System.out.println(list2.getClass().getSimpleName());
		
		
		
		//Collections.sort(list1);

	}

}
