import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number : ");
		int n = sc.nextInt();
		
		if(n>=0)
			System.out.println(n+" is posiive number");
		else
			System.out.println(n+" is negative number");
	}

}
