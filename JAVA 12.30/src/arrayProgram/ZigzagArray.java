package arrayProgram;
import java.util.*;

public class ZigzagArray {
	static int[] zigZag(int[] a,int[] b)
	{
		int i=0,k=0;
		int c[]= new int[a.length+b.length];
		while(i<a.length && i<b.length)
		{
			c[k]=a[i];
			k++;
			c[k]=b[i];
			k++;
			i++;
		}
		while(i<a.length)
		{
			c[k]=a[i];
			k++;
			i++;
		}
		while(i<b.length)
		{
			c[k]=b[i];
			k++;
			i++;
		}
		return c;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of first array ");
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.print("Enter the element for First Array "+n);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter the Size of Second array ");
		int m=sc.nextInt();
		
		int b[]= new int[m];
		System.out.print("Enter the element for second Array "+m);
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int c[] = zigZag(a,b);
		for(int i=0;i<c.length;i++)
		{
		System.out.print(c[i]+" ");
		}
		System.out.println();
		
		


	}

}
