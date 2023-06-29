package stringprogram;

import java.util.Scanner;

public class String11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String st=sc.nextLine();
		int count=1;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(st.charAt(i)==' ')
			{
				count++;
			}
			
		}
			
		System.out.println("Total Words  of string in: "+count);


	}

}
