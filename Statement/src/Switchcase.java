import java.util.Scanner;
public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn;
		do
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter first no. ");
			int no1 = s.nextInt();
			System.out.println("enter second no. ");
			int no2 = s.nextInt();
			System.out.println("select symbol(+,-,*,/)");
			String sym = s.next();
			int res;
			switch(sym)
			{
			case "+":
				res=no1+no2;
				System.out.println("Addition: "+res);
				break;
			case "-":
				res=no1-no2;
				System.out.println("Subtraction: "+res);
				break;
			case "*":
				res=no1*no2;
				System.out.println("Multiplication: "+res);
				break;
			case "/":
				res=no1/no2;
				System.out.println("Division: "+res);
				break;
			default:
				System.out.println("Invalid symbol");
			
			}
			System.out.println("do you want to continue(press y for Yes or n for No)");
			yn = s.next();
			
			
		}while(yn.equals("Y")||yn.equals("y"));
		

	}

}
