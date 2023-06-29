package arrayProgram;


public class FrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {23,45,56,78,32,48,45,78,45};
		printFrequency(ar);
	

	}

	 static void printFrequency(int[] ar) {
		 boolean rs[]= new boolean[ar.length];
		 for(int i=0;i<ar.length;i++)
		 {
			 if(rs[i]==false)
			 {
				 int count=1;
				 for(int j=i+1;j<ar.length;j++)
				 {
					 if(ar[i]==ar[j])
					 {
						 count=count+1;
						 rs[j]=true;
					 }
				 }
				 System.out.println(ar[i]+" "+count);

			 }
			 
			 
		 }
	 }
}


