import java.util.Scanner;
public class Great1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		double a=sc.nextDouble();//5
		double b=sc.nextDouble();//7
		double c= sc.nextDouble();//9
		double d= sc.nextDouble();//6
		
		if(a>b && a>c && a>d)
		{
			System.out.println(a+" a is Big");
		}
		else if(b>c && b>d)
		{
			System.out.println(b+"  b is Big");
		}
		else if(c>d)
		{
			System.out.println(c+"  c is Big");
		}
		else
		{
			System.out.println(d+"  d is Big");
		}

	}

}
