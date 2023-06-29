import java.util.Scanner;
public class Monthname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month number: ");
		int m = sc.nextInt();
		
		if(m==1)
		{
			System.out.println(m+" is Jan");
		}
		else if(m==2)
		{
			System.out.println(m+" is  Feb");
		}
		if(m==3)
		{
			System.out.println(m+" is March");
		}
		else if(m==4)
		{
			System.out.println(m+" is April ");
		}
		else if(m==5) 
		{
			System.out.println(m+" is May ");
		}
		else if(m==6)
		{
			System.out.println(m+" is Jun");
		}
		else if(m==7)
		{
			System.out.println(m+" is July");
		}
		else if(m==8)
		{
			System.out.println(m+" is August ");
		}
		else if(m==9)
		{
			System.out.println(m+" is September");
		}
		else if(m==10)
		{
			System.out.println(m+" is Octomber ");
		}
		else if(m==11)
		{
			System.out.println(m+" is Novmber");
		}
		else if(m==12)
		{
			System.out.println(m+" is December");
		}
		else {
			System.out.println(m+ " is Not Match ");
		}



		








	}

}