
public class StarPatternCross13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<11;i++)
		{
			for(int j=0;j<11;j++)
			{
				if(i==j || i+j==11-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
