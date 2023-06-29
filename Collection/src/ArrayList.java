import java.util.*;
public class ArrayList {

	private char[] length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList  a1= new ArrayList();
		
	    a1.add("Rahul");
		a1.add("Raina");
		a1.add("Rohit");
		a1.add("MSD");
		
		System.out.println(a1.length);
		System.out.println(a1.contains("Rahul"));
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());

	}

}
