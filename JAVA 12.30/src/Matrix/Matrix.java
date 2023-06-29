package Matrix;

import java.util.Scanner;

public class Matrix {
	static int[][] readMat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of the matrix: ");
		System.out.println("Enter the rows");
		int row = sc.nextInt();
		System.out.println("Enter the col");
		int col = sc.nextInt();
		int[][] mat = new int[row][col];
		System.out.println("Enter " + row * col + " integrer values row wise: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		return mat;
	}
	static void disMat(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int[] daigonalBigg(int[][] mat)
	{
		int Pbig=mat[0][0], Sbig=mat[0][mat.length-1];
		for(int i=1;i<mat.length;i++)
		{
			if(mat[i][i]>Pbig)
			{
				Pbig= mat[i][i];
			}
			if(mat[i][mat.length-1-i]>Sbig) {
				Sbig=mat[i][mat.length-1-i];
			}
		}
		int bg[]= {Pbig,Sbig};
		return bg;
	}
	
	void daigonalReverse(int[][] mat) {
		for(int i=0;i<mat.length/2;i++)
		{
			int temp= mat[i][i];
			mat[i][i]=mat[mat.length-1-i][mat.length-1-i];
			mat[mat.length-1-i][mat.length-1-i]=temp;
			
			int temp1=mat[i][mat.length-1-i];
			mat[i][mat.length-1-i]= mat[mat.length-1-i][i];
			mat[mat.length-1-i][i]= temp1;		
		}

	}

	public static int getBiggest(int[][] x) {
		int big = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > big)
					big = x[i][j];
			}
		}
		return big;
	}

	public static int[] countEO(int[][] x) {
		int ec = 0, oc = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] % 2 == 0)
					ec++;
				else
					oc++;
			}
		}
		int[] count = { ec, oc };
		return count;
	}

	public static int[] RowWiseBiggest(int[][] x) {
		int[] big = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			big[i] = x[i][0];
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > big[i])
					big[i] = x[i][j];
			}
		}
		return big;
	}

	public static int[] ColWiseBiggest(int[][] x) {
		int[] big = new int[x[0].length];
		for (int i = 0; i < x[0].length; i++) {
			big[i] = x[0][i];
			for (int j = 0; j < x.length; j++) {
				if (x[j][i] > big[i])
					big[i] = x[j][i];
			}
		}
		return big;
	}

	public static int SumOfMatrix(int[][] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				sum = sum + x[i][j];
			}
		}
		return sum;
	}

	public static int[][] addTwoMatrix(int[][] x, int[][] y) {
		if (x.length != y.length || x[0].length != y[0].length)
			return null;
		int[][] add = new int[x.length][x[0].length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				add[i][j] = x[i][j] + y[i][j];
			}
		}
		return add;
	}

	public static int[] rowSum(int[][] mat) {
		int[] add = new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				add[i] = add[i] + mat[i][j];
			}
		}
		return add;
	}

	public static int[] ColSum(int[][] mat) {
		int[] sum = new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat.length; j++) {
				sum[i] = sum[i] + mat[j][i];
			}
		}
		return sum;
	}

	public static int[][] transpose(int[][] mat) {
		int[][] tns = new int[mat[0].length][mat.length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				tns[j][i] = mat[i][j];
			}
		}
		return tns;
	}
	 

	public static int[][] rowReverse(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			int f = 0, l = mat[0].length - 1, temp;
			while (f < l) {
				temp = mat[i][f];
				mat[i][f] = mat[i][l];
				mat[i][l] = temp;
				f++;
				l--;
			}
		}

		return mat;
	}

	public static int[][] colReverse(int[][] mat) {
		for (int i = 0; i < mat[0].length; i++) {
			int l = mat.length - 1, f = 0, temp;
			while (f < l) {
				temp = mat[f][i];
				mat[f][i] = mat[l][i];
				mat[l][i] = temp;
				f++;
				l--;
			}
		}
		return mat;
	}
	
	public static int[][] rotate90Left(int[][] mat)
	{
		mat=transpose(mat);
		colReverse(mat);
		return mat;
	}
	
	public static int[][] rotate90Right(int[][] mat)
	{
		mat=transpose(mat);
		rowReverse(mat);
		return mat;
	}
	
	
	static void printSpiral(int[][] x)
	{
		int n=x.length-1;
		for(int i=0,j=n;i<j;i++,j--)
		{
			for(int k=i;k<j;k++)
			{
				System.out.print(x[i][k]+" ");
			}
			for(int k=i;k<j;k++)
			{
				System.out.print(x[k][j]+" ");
			}
			for(int k=j;k>i;k--)
			{
				System.out.print(x[j][k]+" ");
			}
			for(int k=j;k>i;k--)
			{
				System.out.print(x[k][i]+" ");
			}
		}
		if(x.length%2==1) {
			System.out.println(x[x.length/2][x.length/2]);
		}
	}
	
	static void printSpiral1 (int[][] x)
	{
		int n=x.length;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(int k=0;k<j;k++)
			{
				System.out.print(x[k][i]+" ");
			}
			for(int k=i;k<j;k++)
			{
				System.out.print(x[j][k]+" ");
			}
			for(int k=j;k>i;k--)
			{
				System.out.print(x[k][j]+" ");
			}
			for(int k=j;k>i;k--)
			{
				System.out.print(x[i][k]+" ");
			}
			
			if(n%2==1)
				System.out.println((x[n/2][n/2]));
		}
			
	}


	
	
}


