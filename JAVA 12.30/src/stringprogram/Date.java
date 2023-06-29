package stringprogram;
import java.util.Scanner;

public class Date {
	int dd;
	int mm;
	int yy;
	
	int months[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	String dname[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	String mname[]= {"jan","feb","march","apr","may","jun","july","aug","sep","oct","nov","dec"};
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%4==0 && yy%100!=0 || yy%400==0)
			months[2]=29;
	}
	int noOfDays()
	{
		int days=0;
		int y=yy-1;
		
		days=days+y*365;
		
		days=days + y/4-y/100 + y/400;
		
		for(int i=1;i<=mm;i++)
		{
			days=days+months[i];
		}
		days=days+dd;
		return days ;
	}
	
	public String toString()
	{
		return dd+ "/" + mm+ "/" + yy;
	}
	public String dayName()
	{
		int ct=noOfDays();
		return dname[ct % 7];
	}
	public String monthName()
	{
		return mname[mm];
	}


	
}
