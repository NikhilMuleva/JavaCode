package stringprogram;
import java.util.Scanner;
public class String22ReverseSentences {
	static String revSentences(String st)
	{
		String rs="";
		char ch[]=st.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			int f=i;
			while(i>=0 && ch[i]==' ')
			{
				i--;
			}
			int l=i+1;
			while(l<=f)
			{
				rs=rs+ch[l];
				l++;
			}
			if(i>=0)
			{
				rs=rs+ch[i];
			}

		}
		return rs;


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ennter the String: ");
		String st =sc.nextLine();
		st = revSentences(st);
		System.out.println(" reverse sentences: "+ st);
		
	}

}
