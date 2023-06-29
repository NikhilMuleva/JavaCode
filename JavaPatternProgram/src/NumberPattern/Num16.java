package NumberPattern;

//10101
//10101
//10101
//10101
//10101
//
//11111
//00000
//11111
//00000
//11111
//
//10101
//01010
//10101
//01010
//10101

import java.util.Scanner;
public class Num16 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the Number:-");
	     int n= sc .nextInt();
	     
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=1;j<=n;j++)
	    	 {
	    		 System.out.print(j%2+"");
	    	 }
	    	 System.out.println();
	     }
	     
	     System.out.println();
	     
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=1;j<=n;j++)
	    	 {
	    	      System.out.print(i%2+"");
	    	 }
	    	 
	    	 System.out.println(); 
	     }
	     
	     System.out.println();
	     int k=1;
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=1;j<=n;j++)
	    	 {
	    		 System.out.print(k%2+"");
	    		 k++;
	    	 }
	    	 System.out.println();
	     }
	     
	     
	}

}
