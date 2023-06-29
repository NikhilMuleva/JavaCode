package arrayProgram;
import java. util.Scanner;
public class MergeArrayElement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperation ao = new ArrayOperation() ;
		System.out.println("enter the first array: ");
		int x[]= ao.readArray();
		System.out.println("Enter the second array:");
		int y[]=ao.readArray();
		int z[]=ao.merge(x, y);
		System.out.println("Merged the Array");
		ao.dispArray(z);		
		

	}

}
