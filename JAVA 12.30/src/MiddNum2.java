import java.util.*;
public class MiddNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number");
		int a=sc.nextInt();
        int b=sc.nextInt();
		int c= sc.nextInt();
		
		// USING THIS WAY WE CAN FIND MIDDEL NUMBER AND ASCENDING ORDER.  12/01/23
		if(a>b && a<c || a>c && a<b)
		{
			if(b<c)
			{
				System.out.println(b+","+a+" ,"+c);
			}
			else
			{
				System.out.println(c+","+a+" ,"+b);
			}
		}
		else if (b>a && b<c || b>c && b<a)
		{
			if(a<c)
			{
				System.out.println(a+","+b+" ,"+c);
			}
			else
			{
				System.out.println(c+","+b+" ,"+a);
			}
		}	
		else
		{
			if(a<b)
			{
				System.out.println(a+","+c+" ,"+b);
			}
			else
			{
				System.out.println(b+","+c+" ,"+a);
			}
		}
	}
}
