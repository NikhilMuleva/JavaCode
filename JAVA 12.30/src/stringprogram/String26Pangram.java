package stringprogram;
 //Define a method to return true if the string is Panagram otherwise return false?
 // Panagram means:-A string that contains all the 26 letters of the English alphabet.
import java.util.Scanner;

public class String26Pangram {
	static boolean isPangram(String st)
	{
		if(st.length()<26)
			return false;
		int count[]= new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		
		for(int i=0;i<26;i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st =sc.nextLine();
		
		boolean rs= isPangram(st);
		if(rs==true)
		{
			System.out.println("Pangram ");
		}
		else {
			System.out.println("panagram is not ");
		}
		

	}

}
