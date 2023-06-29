import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int no = s.nextInt();
		int fact=1;
		int i;
		for(i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("fact: "+fact);


	}

}
