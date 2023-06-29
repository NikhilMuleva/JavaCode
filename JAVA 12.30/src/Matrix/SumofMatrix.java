package Matrix;
import java.util. Scanner;

public class SumofMatrix {

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
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			  sum=sum+a[i][j];
			}
		}
		System.out.println();
        System.out.println("Sum of the matrix is :"+sum);
}
}
