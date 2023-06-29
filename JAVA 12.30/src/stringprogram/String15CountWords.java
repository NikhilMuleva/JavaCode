package stringprogram;
import java.util.Scanner;

public class String15CountWords {
	static int countWords(String st) {
		char ch[] =st.toCharArray();
		int count=0;
		
			for(int i=0;i<ch.length;i++)
			{
				if(i==0 && ch[i]!=' ' ||ch[i]!=' ' && ch[i-1]==' ')
				{
					count++;
				}
			}
			return count;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String: ");
		String st = sc.nextLine();
		int c=countWords(st);
		System.out.println("Count of words : "+ c);

	}

}
