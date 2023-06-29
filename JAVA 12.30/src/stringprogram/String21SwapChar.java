package stringprogram;
//Define a method to swap every words first character with same word last character.
//For example- hi my self nikhil
      //ih ym fles lihkin
import java .util.Scanner;

public class String21SwapChar {
	static String swapCharLast(String st ) {
		char ch[]=st.toCharArray();
		
		int f=0;
		for(int i=0;i<ch.length;i++)
		{
			
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				f=i;
			}
			else if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
			{
				char temp = ch[i];
				ch[i]=ch[f];
				ch[f]=temp;
			}
		}
		st= new String (ch);
		return st;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String: ");
		String st=sc.nextLine();
		st=swapCharLast(st);
		System.out.println("swap the char: "+st);

	}

}
