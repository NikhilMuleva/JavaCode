import java.util.Scanner;
public class DiffBigSmall {
	static int diffBigSmall(int n) 
	{
		int big=-9;
		int small=9;
		do {
			int d=n%10;
			if(d>big)
			{
				big=d;	
			}
			if(d<small)
			{
				small=d;

			}
			n=n/10;
		}while(n!=0);
		return big-small;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n= sc.nextInt();
		int s1= diffBigSmall(n);
		System.out.println("diff of big small is "+ +n +"   "+s1);
		
	
	
	
	}

}
