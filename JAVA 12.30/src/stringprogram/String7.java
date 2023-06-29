package stringprogram;
import java.util.Scanner;

public class String7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		int sum=0;
		for(int i=0;i<st.length();i++)
		{			
			char ch =st.charAt(i);		
			if(Character.isDigit(ch))
			{
				sum=sum+Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of Digits :"+sum);

		
	}

}
