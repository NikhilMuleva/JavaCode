import java.util.Scanner;
public class MiddAscendingOrder {

	public static void main(String[] args) {  //12/01/23
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number:");
		int a=sc.nextInt();
        int b=sc.nextInt();
		int c= sc.nextInt();
		
		int big=(a>b && a>c )?a:(b>c)?b:c;
		
		int small=(a<b && a<c)?a:(b<c)?b:c;
		
		int Midd=(a+b+c)-(small+big);
		
		System.out.println(small+","+Midd+","+ big);

	}

}
