package loop;

public class SecondLargestValueWay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,8,4,5,2,3,1,7,9,10,56,100,200};
		int temp;
		
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i] < a[j])   // if we are find the second smallest value in the array ,so we are using the 
					               // condition like  " if(a[i] > a[j])  " this is used for small value.
				 {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
				
				 
			 }
		 }
		 
		 System.out.println("Second largest element:  " + a[1]);
   
		 
	}

}
