package stringprogram;
import java.util.Scanner;

public class String9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String st=sc.nextLine();
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println("Vowels of string in: "+count);

	}

}
