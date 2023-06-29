package stringprogram;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class String29Anagram1 {
	static boolean isAnagram(String st1,String st2) 
	{
		st1=st1.replaceAll("", "");
		st2=st2.replaceAll("", "");
		if(st1.length()!=st2.length())
		{
			return false;
		}
		st1=st1.toLowerCase();
		st2=st2.toLowerCase();
		
		char[] c1=st1.toCharArray();
		char[] c2=st2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String st1=sc.nextLine();
		System.out.println("Enter the second String: "); 
		String st2=sc.nextLine();
		boolean rs= isAnagram(st1,st2);
		if(rs==true)
		{
			System.out.println("Strings are Angram");
		}
		else {
			System.out.println("Strings are not Anagram");
		}

	}

}
