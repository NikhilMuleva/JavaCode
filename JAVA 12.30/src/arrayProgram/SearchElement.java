package arrayProgram;
import java.util.Scanner;

public class SearchElement {
	static int search(int[] arr,int ele) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
				return i;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element"+n);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element you want search:");
		int ele=sc.nextInt();
		int in=search(arr ,ele);
		System.out.println(in);
		if(in!=-1)
			System.out.println("elemnet found:  "+in);
		else
			System.out.println("element not found:  "+in);
	}

}
