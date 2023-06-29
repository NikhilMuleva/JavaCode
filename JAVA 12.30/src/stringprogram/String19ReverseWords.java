package stringprogram;
//  write a java Define a method reverse the every word in the sentences.

import java.util.Scanner;

public class String19ReverseWords {
	 static String reverseWords(String st) {
		 String rs="";
		 char ch[]=st.toCharArray();
		 for(int i=0;i<ch.length;i++)
		 { 
			 int f=i;
			 while(i<ch.length && ch[i]!=' ')
			 {
				 i++;
			 }
			 int l=i-1;
			 while(l>=f)
			 {
				 rs=rs+ch[l];
				 l--;
			 }
			 if(i<ch.length)
				 rs=rs+ch[i];
		 }
		 return rs;
		}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String st =sc.nextLine();
		st=reverseWords(st);
		
		System.out.println("reverse string is: "+st);
		

	}

   
}
