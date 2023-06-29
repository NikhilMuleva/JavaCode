import java.util.Scanner;
public class SdigitCount {
	static int digitCount(int n)
	{ 
		 int count=0;
		
		while(n!=0)
		{
			int r= n%10;
		    
			count++;
			n=n/10;
		}
		return count;
		
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n= sc.nextInt();
		int s1= digitCount(n);
		System.out.println("The number of: "+n+" digit is "+s1);

	}

}

	


