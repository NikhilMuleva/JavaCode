package stringprogram;
//Write a java Program to how many Vowels and consonents in present String.
import java .util.Scanner;
public class String6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String st=sc.nextLine();
		int vc=0 ,cc=0;
	    
		for(int i=0;i<st.length();i++) 
		{
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z'||ch>='a'&&ch<='z')
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'|| ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vc++;
				}
				else {
					cc++;
				}
			}
		}
		System.out.println("Numbers of vowels "+ vc);
		System.out.println("Numbers of consonents "+ cc);
	}

}
