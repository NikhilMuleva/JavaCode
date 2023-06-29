package stringprogram;
//Write a program to frequency of each character is given to the String
import java.util .Scanner;

public class String24FrequencyCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");//AabAbBabadaa
		String st = sc.nextLine();
		int count[] = new int[128];
		for(int i=0;i<st.length();i++)
		{
			char ch =st.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0) {
				System.out.println((char)i+" -> "+count[i]);
			}
		}

	}

}
