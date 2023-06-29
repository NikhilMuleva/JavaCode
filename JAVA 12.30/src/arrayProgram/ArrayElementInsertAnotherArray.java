package arrayProgram;
//Define a method insert one element array another array specified index.
import java.util.Scanner;
public class ArrayElementInsertAnotherArray {
	static int[] merge(int[] ar, int[] ar1, int in) {
		int x[]= new int[ar.length + ar1.length];
		for(int i=0;i<ar1.length;i++)
		{
			x[i+in]=ar1[i];
			
		}
		for(int i=0;i<ar.length;i++)
		{
			if(i<in)
			{
				x[i]=ar[i];
				
			}
			else
				x[i+ar1.length]=ar[i];
		}
		return x;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int n1 =sc.nextInt();
        int[] ar1 = new int[n1];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n1; i++) {
            ar1[i] = sc.nextInt();
        }
        System.out.println("Enter the Index to merge");
        int in =sc.nextInt();
        int z[]= merge(ar,ar1,in);
        for(int i=0;i<z.length;i++)
        {
        	System.out.print(z[i]+" ");
        }  
	}
	
}
