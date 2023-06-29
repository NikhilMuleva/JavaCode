import java.util.Scanner;                                  
                                                        //12/01/23
public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date (dd mm yyyy)");
		int d= sc.nextInt();
		int m =sc.nextInt();
		int y=sc.nextInt();
		
		if(d<1 || m<1||y<1||d>31|| m>12)
		{
			System.out.println("Date is Invalid");
		}
		else if((m==4 || m==6 ||m==9|| m==11) && d>30)
		{
			System.out.println("Date is Invalid");
		}
		else if((y%4==0 && y%100!=0 || y%400==0)==false && m==2 && d>28)
        {
			System.out.println("Date is Invalid");
			
		}
		else
		{
			System.out.println("Date is Valid");
		}
		

	}

}
