
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//        0  1  2  3  4  5  6  7  8  9      Indext Number
				System.out.println();
		
		for(int i=a.length-1;i>=0;i--) // Reverse Order
		{
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		for(int i=1;i<=a.length-2;i++) //Print all the data accept first one and last.
		{
			System.out.println(a[i]);
		}
		 System.out.println();
		 
		 for(int i=2;i<=a.length-3;i++) //Print all the data accept first two and last two.
		 {
		    System.out.println(a[i]);
		 }
	
		 System.out.println();
		 
		 for(int i=a.length-3;i<=a.length-1;i++) //Print   last 3 data.
		 {
			 System.out.println(a[i]);
			 
		 }
		 System.out.println();
		 
		 for(int i=0;i<a.length/2;i++) //Print first half of the array.
		 {
			 System.out.println(a[i]);
		 }
		 System.out.println();
		 
		 
		 for(int i=a.length/2;i<=a.length-1;i++)  //Print Last half of the array
		 {
			 System.out.println(a[i]);
		 }
		  

	}

}
