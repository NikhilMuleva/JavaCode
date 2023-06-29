import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int y=sc.nextInt();
		if((y%400==0)||(y%4==0 && y%100!=0)) //(y%4==0 && y%100!=0 || y%400) one more way
		{
			System.out.println(y +" is Leap year");
		}
		else
		{
			System.out.println(y+" is not Leap year");
			
		}
		
		// USING CONDITIONAL OPERATOR 12/01/23
		String st = (  y%4==0 && y%100!=0 || y%400==0) ? "leap year" : " Not leap year";
         System.out.println(y + " is "+ st);
	}

}
