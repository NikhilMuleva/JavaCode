import java.util.Scanner;
public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int no = s.nextInt();
		int rev=0,rem;
		int temp=no;
		while(temp != 0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no +"is palindrome number");
		}
		else
		{
			System.out.println(no  +"is not palindrome number");
		}
			
		

	}

}
