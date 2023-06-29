package Matrix;
import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the rows");
		int row=sc.nextInt();
		System.out.println("Enter the columns");
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		System.out.println("Enter the "+row*col+"element: ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("user enterd the matrix: ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}	

	}

}
