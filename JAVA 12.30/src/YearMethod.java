import java.util.Scanner;
public class YearMethod {
	static boolean leapyear(int y)
	{
		if(y%4==0 && y%100!=0 || y%400==0)
		{
			return true;
		}
		
		else
		{
		   return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int y = sc.nextInt();
		boolean b = leapyear(y);
		if(b==true)
		{
			System.out.println(b + "is  leap year");
		}
		else
		{
			System.out.println(b +" is not leap year");
		}
	
	}

}
