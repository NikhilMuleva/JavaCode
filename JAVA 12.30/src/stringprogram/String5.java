package stringprogram;
import java.util.Scanner;
//Convert String to Array using method toCharArray

public class String5 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the String");
      String str = sc.nextLine();
      char[] ch=str.toCharArray();
      int uc =0,lc=0,dc=0,spc=0;
      for(int i=0;i<str.length();i++)
      {
    	  if(ch[i]>='A' && ch[i]<='Z')
    		  uc++;
    	  else if (ch[i]>='a' && ch[i]<='z')
    		  lc++;
    	  else if(ch[i]>='0' && ch[i]<='9')
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
