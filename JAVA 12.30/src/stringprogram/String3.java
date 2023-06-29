package stringprogram;
import java.util.Scanner;
public class String3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentences ");
		String str = sc.nextLine();
		int uc=0,lc=0,dc=0,spc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch>='A' && ch<='Z')
				uc++;
			else if(ch>='a' && ch<='z')
				lc++;
			else if(ch>='0' && ch<='9')
				dc++;
			else
				spc++;
		}
		System.out.println("number of Capital letters "+uc);//Count upercase lettr
		System.out.println("number of lower letter "+lc);// count lowercase letter
		System.out.println("number of digits "+dc);// count the digit
		System.out.println("Numbers of special characters "+spc);//count special character
	}

}
