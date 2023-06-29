package arrayProgram;
import java.util.Scanner;

public class AvgArray {
	public static double sumAvg(double arr[],int n) {
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum/n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n= sc.nextInt();
		double arr[]=new double[n];
	    System.out.println("enter the elements "+n);
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextDouble();
	    }
	    double a=sumAvg(arr,n);
	    System.out.println(a);
	    
	    
	    
	}

}
