package stringprogram;
//Print frequency Alphabate irrespective of  case in the string.
import java.util.Scanner;

public class String25Alphabate {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the String: ");
      String st = sc.nextLine();
      int count[]= new int[26];
      for(int i=0;i<st.length();i++)
      {
    	  char ch=st.charAt(i);
    	  if(ch>='A' && ch<='Z')
    	  {
    		 count[ch-65]++;
    	  }
    	  else if(ch>='a' && ch<'z')
    	  {
    		  count [ch-97]++;
    	  }
      }
      for(int i=0;i<26;i++)
      {
    	  if(count[i]!=0)
    		  System.out.println((char)(i+65)+ " -> " +count[i]);
    	  else
    		  System.out.println((char)(i+97)+ " -> " +count[i]); 
      }
	}

}
