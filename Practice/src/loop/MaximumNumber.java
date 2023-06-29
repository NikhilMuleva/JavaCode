package loop;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,1,2,6};
		int max =a[0];
		int min =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				System.out.println();
			}
		}
		System.out.println("maximum elements:"+ max);
		
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum Elements:"+ min);


	}

}
