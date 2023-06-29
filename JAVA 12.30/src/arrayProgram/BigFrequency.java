package arrayProgram;
// without comapring the element we check the number of frequency and print positive index.

public class BigFrequency {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,45,56,78,32,48,45,78,45};
		printFrequency(arr);
	

	}

	  public static void printFrequency(int[] arr) {
		 int big=arr[1];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>big)
			 {
				 big=arr[i];
			 }
		 }
		 int count[]= new int[big+1];
		 for(int i=0;i<arr.length;i++)
		 {
			 count[arr[i]]++;
		 }
		 for(int i=0;i<count.length;i++)
		 {
			 if(count[i]!=0)
				   System.out.println(i+"   count of "+count[i]);	 
		 }
			 
			 	
	}



}
