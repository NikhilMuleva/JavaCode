package Matrix;


public class BiggestDaigonal {
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

	public static void main(String[] args) {
		Matrix mt= new Matrix();
		int[][] x=mt.readMat();
		System.out.println("user entered matrix");
		mt.disMat(x);
		int big[]=mt.daigonalBigg(x);
		System.out.println("Primary Daigonal Biggest: "+big[0]);
		System.out.println("Secondary Daigonal Biggest: "+big[1]);
		
	}

}
