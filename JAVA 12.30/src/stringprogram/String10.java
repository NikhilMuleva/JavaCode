package stringprogram;

import java.util.Scanner;

public class String10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String st=sc.nextLine();
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(Character.isLetterOrDigit(ch)==false)
			{
				count++;
			}
		}
		System.out.println("special  of string in: "+count);

	}


}


