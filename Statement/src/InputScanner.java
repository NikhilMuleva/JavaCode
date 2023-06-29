import java.util.Scanner;
public class InputScanner {

	public static void main(String[] args) {
		
		int n;
		System.out.println("enter any numbers");
		Scanner r = new Scanner (System.in);
		n = r.nextInt();
		if(n%2==0)
		{
			System.out.println("even");
		}
		else 
		{
			System.out.print("odd");
		}
		

	}

}
