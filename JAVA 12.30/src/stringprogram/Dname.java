package stringprogram;
import java.util.Scanner;

public class Dname {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first date:(dd mm yy)");
		int d1=sc.nextInt();
		int m1=sc.nextInt();
		int y1=sc.nextInt();
		Date dt1= new Date(d1,m1,y1);
		System.out.println("Daysname "+dt1.dayName());
		System.out.println("Monthsname "+dt1.monthName());
		
		System.out.println(dt1.noOfDays());
		
		
		
		

	}

}
