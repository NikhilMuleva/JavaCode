import java.util.Scanner;
public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int x= sc.nextInt();
		System.out.println("Enter the Second number: ");
		int y =sc.nextInt();
		if(x==y)
			System.out.println("Equal Number: ");
		else
			System.out.println("Not Equal Number");
	}

}
