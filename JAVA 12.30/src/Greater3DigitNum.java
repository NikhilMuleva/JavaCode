import java.util.*;
public class Greater3DigitNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int n=sc.nextInt();
        if(n>=100 && n<=999||n>=-999 && n<=-100)
        {
        	System.out.println( n+" is Three digit Num");
        	
        }
        else
        {
        	System.out.println(n+" is not Three digit number");
        }
       }

}
