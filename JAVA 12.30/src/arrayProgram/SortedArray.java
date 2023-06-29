package arrayProgram;
import java.util.*;

public class SortedArray {
	static int[] sorted(int[] a,int[] b)
	{
		int i=0,j=0,k=0;
		int c[]= new int[a.length+b.length];
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else {
				c[k]=b[j];
				j++;
			}
			k++;
		}
		 while (i<a.length)
		 {
			 c[k]=a[i];
			 k++;
			 i++;
		 }
		 while(i<b.length)
		 {
			 c[k]=b[j];
			 k++;
			 j++;
		 }
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System .in);
		System.out.println("Enter the First Array size :");
		int n= sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the element "+n);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Second Array size :");
		int m= sc.nextInt();
		int b[]= new int[m];
		System.out.println("Enter the element "+m);
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int c[]=sorted(a,b);
		
			for(int i=0;i<c.length;i++) {
			    System.out.print(c[i]+" ");
			}
		
		
		
	}

}
