package arrayProgram;

public class ReverseArray {

	public static void main(String[] args) {
		int x[]= {23,56,67,78,79,89};
		reverseArray(x);
		System.out.println("After Reverse Array: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]+" ");
		}

	}
	static void reverseArray(int[] arr)
	{
		int i=0,j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
