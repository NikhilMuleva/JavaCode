
public class KthLargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,3,7,8,6,8,9,4,1};
		 int k= 4;

		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
				 
			 }
			 if(i==k-1)
			 {
				 System.out.println("k th largest value in :"+a[i]);
			 }
			 
		 }
		 System.out.println("------------------");
		 for(int i=0;i<a.length;i++)
		 {
		 System.out.print(a[i]+" ");
		 }

	}

}
