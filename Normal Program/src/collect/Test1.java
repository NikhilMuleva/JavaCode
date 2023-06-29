package collect;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1= new LinkedList();
		l1.add("rahul");
		l1.add("rohit");
		l1.add("msd");
		l1.add("virat");
		
		ArrayList a1= new ArrayList(l1);
		System.out.println(a1);
		System.out.println(l1);

	}

}
