package arrayProgram;
import java.util.Scanner;

public class BiggestElementOfArray {
	static int Big( int arr[]) {
         
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>max)
				max= arr[i];
		}
		return max;
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
       int b=Big(arr);
       System.out.println("Biggest element "+b);
	}

}
