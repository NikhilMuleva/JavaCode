package collect;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class reversarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> a1= new LinkedHashSet<String>();
		a1.add("red");
		a1.add("blue");
		a1.add("green");
		a1.add("orange");
		a1.add("rinked");
		for(String s:a1) {
		
		System.out.println(s);
		}
		System.out.println();
        Object x[]=a1.toArray();//coverts collection to array
         for(int i=x.length-1;i>=0;i--)
         {
        	 System.out.println(x[i]);
         }

	}

}
