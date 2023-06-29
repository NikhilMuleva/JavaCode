package NumberPattern;

//1
//10
//101
//1010
//10101
//
//10101
//1010
//101
//10
//1
//
//1
//01
//010
//1010
//10101
//
//1
//00
//111
//0000
//11111
//
//11111
//0000
//111
//00
//1

import java.util.Scanner;

public class Num17 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the Number:-");
	     int n= sc .nextInt();
	     
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=1;j<=i;j++)
	    	 {
	    		 System.out.print(j%2+"");
	    	 }
	    	 System.out.println();
	     }
	     System.out.println();
	     
	     for(int i=n;i>=1;i--)
	     {
	    	 for(int j=1;j<=i;j++)
	    	 {
	    		 System.out.print(j%2+"");
	    	 }
	    	 System.out.println();
	     }
	     
	     
	     System.out.println();
	     int k=1;
	     
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=1;j<=i;j++)
	    	 {
	    		 System.out.print(k%2+"");
	    		 k++;
	    	 }
	    	 System.out.println();
	     }
	     
	     System.out.println();
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=1;j<=i;j++)
	    	 {
	    		 System.out.print(i%2+"");
	    	 }
	    	 System.out.println();
	     }
	     
	     System.out.println();
	     for(int i=n;i>=1;i--)
	     {
	    	 for(int j=1;j<=i;j++)
	    	 {
	    		 System.out.print(i%2+"");
	    	 }
	    	 System.out.println();
	     }
	     System.out.println();
	     
	}

}
