package Pattern;
//  1
// 121
//12321
// 121
//  1

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		
		int n= sc.nextInt();
		int sp=n/2, st=1;
				
		for(int i=1;i<=n;i++)//1 2 3 4
		{
           for(int j=1;j<=sp;j++) //3 2 1
			{
				System.out.print(" ");	
			}
           int k=1;

            for(int j=1;j<=st;j++)//
            {
            	System.out.print(k+"");
            	if(j<=st/2)
            		k++;
            	else
            		k--;
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