package arrayProgram;
import java.util.Scanner;

public class NthBiggestElement {
	 static int nthBigg(int[] x,int n) {
		 for(int i=0;i<x.length;i++)
		 {
			 int count =0;
			 for(int j=0;j<x.length;j++)
			 {
				 if(x[j]>x[i])
					 count++;
			 }
			 if(count==n-1)
				 return x[i];
		 }
		 return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ar[]= {23 ,45,56,78,32,48};
		int big1= nthBigg(ar,2);
		System.out.println("2nd biggest Element "+big1);
		int big2= nthBigg(ar,4);
		System.out.println("4th biggest element "+big2);
		
		
	}

}
