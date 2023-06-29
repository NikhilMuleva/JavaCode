import java.util.Scanner;
public class SumEvenOdd{
	 static boolean isGood(int num) {
        int evenSum = 0;
        int oddSum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenSum =evenSum+ digit;
            } else {
                oddSum =oddSum+ digit;
            }
            num /= 10;
            
        }
       
        return evenSum ==oddSum;   
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		boolean rs=isGood(num);
	    System.out.println(isGood(num));
	   	
		
       
       
    }
    
}