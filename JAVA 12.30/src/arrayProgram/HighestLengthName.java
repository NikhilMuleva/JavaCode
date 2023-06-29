package arrayProgram;
//Define a method to raed n name from the users and return Highest Length Name..l
import java.util.Scanner;

public class HighestLengthName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n= sc.nextInt();
		String names[]=new String[n];
		System.out.println("Enter the element: "+n);
		for(int i=0;i<names.length;i++)
		{
			names[i]=sc.next();
		}
		
		String hnames=names[0];
		for(int i=1;i<names.length;i++)
		{
			if(names[i].length()>hnames.length())
			{
				hnames=names[i];
			}
			System.out.println("highest element :"+hnames);
		}
	}

}
