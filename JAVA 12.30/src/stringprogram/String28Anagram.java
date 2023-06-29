package stringprogram;
//Anagram:-Two strings are said to be anagram if we can form one string by arranging the characters of another string.
//For example:- Keep ,Act ,God, Mother in law 
//              Peek, Cat, Dog, Hitler woman

import java.util.Scanner;

public class String28Anagram {
	static boolean isAnagram(String st1,String st2)
	{
		int ct1[] = new int[26];
		for(int i=0;i<st1.length();i++)
		{
			char ch=st1.charAt(i);
			if(ch>='A' && ch<='Z')
				ct1[ch-65]++;
			else if(ch>='a' && ch<='z')
				ct1[ch-97]++;
		}
		int ct2[] = new int[26];
		for(int i=0;i<st2.length();i++)
		{
			char ch=st2.charAt(i);
			if(ch>='A' && ch<='Z')
				ct2[ch-65]++;
			else if(ch>='a' && ch<='z')
				ct2[ch-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if(ct1[i]!=ct2[i])
				return false;
		}
		return true;
		
		
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
