package arrayProgram;
//Define a method to count how many time specified element present in the array?
import java.util.Scanner;

public class CountArrayElement {
	static int countElement(int[] arr,int ele) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele) {
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int ele=sc.nextInt();
		int arr[]=new int[ele];
		System.out.println("Enter the element "+ele);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		 int z=countElement(arr ,ele);
		 System.out.println("the "+ele+" is present "+z+" Times");
		

	}

}
