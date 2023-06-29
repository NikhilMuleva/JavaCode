package Pattern;
//10101
//01010
//10101
//01010
//10101


import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
				int k=1;

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(k%2+"");
				k++;
			}
			System.out.println();
		}

	}

}
