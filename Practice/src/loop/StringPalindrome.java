package loop;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mam";
		String rev = "";

		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("palindrome Number");
		}
		else
		{
			System.out.println("not Palindrome number");
		}

	}

}
