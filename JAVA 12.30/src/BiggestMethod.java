import java.util.Scanner;
public class BiggestMethod {
	static void largNum(int a,int b,int c) {
		if(a>b && a>c)
		{
			System.out.println(a+" a is big: ");

		}
		else if(b>c)
		{
			System.out.println(b+"  b is big ");

		}
		else {
			System.out.println( c+ " c is big ");

		}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a =sc.nextInt();

        int b =sc.nextInt();

		int c =sc.nextInt();
		

		largNum(a,b,c);

	}

}
