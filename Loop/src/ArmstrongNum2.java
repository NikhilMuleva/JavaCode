import java.util.Scanner;
public class ArmstrongNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, arm=0, rem,c;
		System.out.println("Enter the Number");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		c=n;
		while(n>0)
		{
			rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
		
		if(c==arm)
		{
			System.out.println("is armstrong number");
		}
		else
		{
			System.out.println("is not armstrong number");

		}

	}

}
 