import java.util.Scanner;
public class MiddNum1 {                                          //12/01/23

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number");
		int a=sc.nextInt();
        int b=sc.nextInt();
		int c= sc.nextInt();
		
		if(a>b && a<c || a>c && a<b)
		{
			System.out.println(a+" a is Middel");
		}
		else if (b>a && b<c || b>c && b<a)
		{
			System.out.println(b+"  b is middel");
		}
		else
		{
			System.out.println(c+" c is Middel");
		}
		

	}

}
