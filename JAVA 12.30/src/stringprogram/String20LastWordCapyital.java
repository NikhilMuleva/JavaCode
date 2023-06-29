package stringprogram;
//define a method to convert every word last character into Captital and remaining are all to small.
import java .util.Scanner;
public class String20LastWordCapyital {
	static String lastCaps(String st) {
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else {
				if(ch[i]>='A' && ch[i]<='Z') 	
					ch[i]=(char)(ch[i]+32);
				
			}
		}
		st= new String(ch);
		return st;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String st=sc.nextLine();
		st=lastCaps(st);
		System.out.println("String the lastCapital letter: "+st);
		

	}

}
