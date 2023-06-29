package collect;
import java.util.*;

public class Iter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1= new ArrayList ();
		al1 .add("Rahul");
		al1 .add("Rohit");
		al1 .add("MSD");
		al1 .add("Raina");
		al1 .add("Virat");
		System.out.println(al1);
		
		
		Iterator<String> lt = al1.iterator();
		System.out.println(lt);
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		

	}

}
