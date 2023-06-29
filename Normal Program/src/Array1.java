import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int a[]= new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();

			
		}
		System.out.println("printed array elememnt");

		for(int j=0;j<size;j++)
		{
			System.out.println(a[j]+ " ");
		}

	}

}
