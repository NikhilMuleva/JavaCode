import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.nextLine();
		System.out.println("After Reverse String is :");
		 
		
		for(int i=s.length();i>=0;i--)
		{
			System.out.println(s.charAt(i-1));
		}

	}

}
