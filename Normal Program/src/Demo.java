import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm = new TreeMap();
		tm.put(1,"Rahul");
		tm.put(7,"MSD");
		tm.put(45,"Rohit");
		tm.put(10,"Sachin");
		tm.put(4,"Abhishek");
		for(Object x:tm.entrySet())
		{
			System.out.println(x);
		}

	}

}
