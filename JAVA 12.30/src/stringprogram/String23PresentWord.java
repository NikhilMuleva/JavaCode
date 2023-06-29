package stringprogram;
//Print how many characters presents in the each word.
import java .util.Scanner;

public class String23PresentWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String st = sc.nextLine();
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			String w="";
			while(i<ch.length && ch[i]!=' ')
			{
				w=w+ch[i];
				i++;
			}
			if(w.length()>0)
				System.out.println(w+"  -> "+w.length());
		}

	}

}
