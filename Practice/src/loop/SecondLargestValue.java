package loop;

public class SecondLargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest = Integer.MIN_VALUE;      // -2147483648
		int secondlargest = Integer.MIN_VALUE; // -2147483648
        int a[]= {6,8,3,5,2,1,4,7};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				secondlargest=largest;
				largest=a[i];
			}
			else if(a[i]>secondlargest && a[i]!= largest)
			{
				secondlargest=a[i];
			}
		}
		if(secondlargest==Integer.MIN_VALUE)
		{
			System.out.println("there is no second largest element ");
		}
		else
		{
			System.out.println("second largest element :"+secondlargest);
		}
		

	}

}
