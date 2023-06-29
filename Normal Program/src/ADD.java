import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class ADD {

	

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		Scanner s = new Scanner(System.in);
		 System.out.println("enter element");
		 for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j]=s.nextInt();
			}
		}
		 System.out.println("matrix :");
		 //int big=a[0][0];
		 for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++){
					 int big=a[0][0];
					if(big<a[i][j])
						big=a[i][j];
				System.out.print(big+" ");	
		}
				System.out.println();
	}

}}
