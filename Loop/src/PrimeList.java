
public class PrimeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int sum=0;
		for(int no=1;no<=100;no++){
			for(int i=2;i<=no-1;i++)
			{
				if(no%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0 || no!=0)
			{
				sum=sum+no;
			}
			System.out.println(sum);
		}

	}

}
