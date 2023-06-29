package stringprogram;
import java.util.Scanner;

public class String16ReverseArray {
	 static String reverse(String st)
	{
		 char ch[]=st.toCharArray();
		 int i=0 ,j=ch.length-1;
         while(i<j) {
        	 char t=ch[i];
        	 ch[i]=ch[j];
        	 ch[j]=t;
         }
         st = new String(ch);
         return st;
				 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st =sc.nextLine();
		st =reverse(st);
		System.out.println("reverse string"+st);
		
	}

}
