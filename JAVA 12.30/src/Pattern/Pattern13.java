package Pattern;
//    1
//   010
//  10101
// 0101010
//101010101
// 0101010
//  10101
//   010
//    1
//

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		
		int n= sc.nextInt();
		int sp=n/2, st=1; int k=1;
				
		for(int i=1;i<=n;i++)
		{
           for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");	
			}

            for(int j=1;j<=st;j++)
            {
            	System.out.print(k%2+"");
            	k++;
            }
            if(i<=n/2) {
            	sp--;
                st=st+2;

            }
            else {
            	sp++;
                st=st-2;

            }
               
			System.out.println();
		}


	}

}
