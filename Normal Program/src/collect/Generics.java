package collect;
import java.util.*;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1= new ArrayList();
		a1.add("red");
		a1.add("blue");
		a1.add("green");
		a1.add("orange");
		a1.add("rinked");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
        System.out.println();
        Object x[]=a1.toArray();//coverts collection to array
        for(Object o:x) {
        	System.out.println(o);
        }
        
          


	}

}
