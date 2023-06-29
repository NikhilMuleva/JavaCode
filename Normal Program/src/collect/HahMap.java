package collect;
import java.util.*;
public class HahMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm= new HashMap<Integer,String>();
		hm.put(1, "Rahul");
		hm.put(18, "virat");
		hm.put(10, "sachin");
		hm.put(7, "msd");
		System.out.println("---------keys----");
		for(Integer i:hm.keySet())
		{
			System.out.println(i);
		}
		System.out.println("--values---");
		for(String s:hm.values())
		{
		 System.out.println(s);
		 
		}
		System.out.println("--keyvalues------");
		for(Object x:hm.entrySet())
		{
			System.out.println(x);
		}


	}

}
