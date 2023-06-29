package arrayProgram;
import java.util.Scanner;

public class SumOfDigitArray {
	public static void main(String[] args) {
		ArrayOperation ao = new ArrayOperation();
		int[] y=ao.readArray();
		System.out.println("user enterd the Array");
		ao.dispArray(y);
		ao.upDate(y);
		System.out.println("after the update the array");
		ao.dispArray(y);
		
	}
	
	
}
