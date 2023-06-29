package stringprogram;
//For a String Lowercase check in the String is Pangram or not?

import java.util.Scanner;

public class String27Pangram {
	static boolean isPangram(String st)
	{
		if(st.length()<26)
			return false;
		st=st.toLowerCase();
		for(char ch='a';ch<='z';ch++)
		{
			if(st.indexOf(ch)==-1)
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
