package arrayProgram;

import java.util.Scanner;

public class EvenOdd {
	 public static int[] countEvenOdd(int arr[]) {
        
		int count[]=new int[2];
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]%2==0)
				{
				 count[0]++;
				}
			else
				{
				 count[1]++;
				}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n= sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the element "+n);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
       
		int count[]= countEvenOdd(arr);
		System.out.println("Even numbers in the array: "+count[0]);
		System.out.println("Odd numbers in the array: "+count[1]);
       
	}


}
