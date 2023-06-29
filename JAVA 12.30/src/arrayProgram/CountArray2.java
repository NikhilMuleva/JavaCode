package arrayProgram;
// Find the smallest element in the present array?

import java.util.Scanner;

public class CountArray2 {
	static int countElement(int arr[] ,int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			int c=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					c++;
				}
			}
			
			if(c==arr.length-n)
			{
				return arr[i];
			}
		
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int ele=sc.nextInt();
		int arr[]=new int[ele];
		System.out.println("Enter the element "+ele);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		 int x=countElement(arr ,ele);
		 if(x==-1)
		 {
			 System.out.println("Invalid Number");
		 }
		 else
		 {
			 System.out.println(x);
		 }

	}

}
