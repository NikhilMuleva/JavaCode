package StarPattern;

import java.util.Scanner;

public class Star12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
	    int n=sc.nextInt();
	    int x=1,y=(n*2)-1;
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<(n*2);j++) 
	    	{
	    		if(j==x || i==y)
	    		{
	    			System.out.print("*");
	    		}
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    		x++; 
	    		y--;
	    	}
	    	
		    System.out.println();
	    }
	    
	}

}
