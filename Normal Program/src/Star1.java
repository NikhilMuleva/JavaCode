
public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		for(int k=1;k<=5;k++)
		{
			for(int l=5;l>k;l--)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=k;m++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		
		for(int n=1;n<=5;n++)
		{
			for(int p=5;p>=n;p--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
