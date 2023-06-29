package stringprogram;
import java.util.Scanner;

public class String14Reverse {
	static String reverse(String st) {
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			rev= rev+st.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st = sc.nextLine();
		st= reverse(st);
		System.out.println("Reverse of String is: "+st);

	}

}
