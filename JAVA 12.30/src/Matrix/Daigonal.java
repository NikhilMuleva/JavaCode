package Matrix;
// Print Daigonal elements from the Matrix

import java.util.Scanner;

public class Daigonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows:");

		int r= sc.nextInt();
		System.out.println("enter the col:");

		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the "+r*c+"element: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();

		}
		int rdaig=0,ldaig=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					ldaig=ldaig+a[i][j];
				}
                if((i+j)==(a.length-1))
                	rdaig=rdaig+a[i][j];
			}
		}
		System.out.println("Sum of left daigonal   "+ldaig);
		System.out.println("Sum of right daigonal  "+rdaig);

	}

}
