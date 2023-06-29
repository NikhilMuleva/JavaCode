package stringprogram;
//Convert Userenter number into sentences

import java.util.Scanner;

public class String18ConertNumberintosentences {
	static void nw(int n,String st) {
		String x[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve","Thirteen","Fourteen",
				        "fifteen","sixteen","seventeen","eighteen","nineteen"};
		
		String y[]= {"","","twentey","thirtey","Fourtey","fiftey","sixtey","seventey","eightey","ninetey"};
		if(n<20)
			System.out.print(x[n]);
		else
			System.out.print(y[n/10]+x[n%10]);
		
		if(n!=0)
			System.out.print(st+" ");
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the Number");
		int amt=sc.nextInt();
		nw(amt/10000000,"Crore");
		nw(amt/100000%100,"Lakh");
		nw(amt/1000%100,"Thousand");
		nw(amt/100%10,"Hunderad");
		nw(amt%100,"");
		
		

	}

}
