package NumberPattern;

//    1
//   000
//  11111
// 0000000
//111111111
//
//    1
//   010
//  10101
// 0101010
//101010101


import java.util.Scanner;


public class Num18 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the Number:-");
	     int n= sc .nextInt();
	     
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=1;j<=n-i;j++)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 for(int k=1;k<=2*i-1;k++)
	    	 {
	    		 System.out.print(i%2+"");
	    	 }
	    	 System.out.println();
	     }
	     
	     System.out.println();
	     int k=1;
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=1; j<=n-i;j++)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 
	    	for(int j=1;j<=2*i-1;j++)
	    	{
	    	  System.out.print(k%2+"");
	    	  k++;
	    	  
	    	}
	    	System.out.println();
	     }
	}

}
