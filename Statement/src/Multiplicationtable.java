import java.util.Scanner;
public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int no = s.nextInt();
		
		for(i=1;i<=10;i++)
		{
			System.out.println(no+"*"+i+" = "+no*i);
		}

	}

}
