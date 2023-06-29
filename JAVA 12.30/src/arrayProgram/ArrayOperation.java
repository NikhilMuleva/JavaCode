package arrayProgram;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayOperation {
	int[] readArray() {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the Size of Array: ");
	    int n= sc.nextInt();
	    int[] ar= new int[n];
	    System.out.println("enter the Element"+n);
	    for(int i=0;i<ar.length;i++)
	    {
	    	ar[i]=sc.nextInt();
	    }
	    return ar;
	}
	
	// Assignmenet 5- Define a method to Replace every array element by their sum of each Digits.
	void upDate( int[] ar)
	{
		for(int i=0;i<ar.length;i++) {
			ar[i]=sumDigit(ar[i]);
		}
	}
	
	int sumDigit(int n) {
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}
	
	void dispArray(int[] ar) {
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
		System.out.println();
	}
	
	
	
// Assignmenet 4- Define a method to return how many prime numbers present in the array.

	boolean isPrime(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	int countPrime(int[] ar)
	{
		int count =0;
		for(int i=0;i<ar.length;i++)
		{
			boolean rs= isPrime(ar[i]);
			if(rs==true)
				count++;
		}
		return count;
	}
	
	// Define A method to Merge two array element into one single Array
	
	static int[] merge(int[] x,int[] y)
	{
	    int z[]= new int[x.length+y.length]; 
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			z[x.length+i]=y[i];
		}
		return z;
	}
		
	
}
