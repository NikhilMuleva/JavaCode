package arrayProgram;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {23,56,39,28,85,57};
	    x= insertArr(x,2,35);
	    if(x==null)
	    {
	    	System.out.println("Index out of range");
	    }
	    else {
	    	System.out.println("After insert element");
	    	for(int i=0;i<x.length;i++)
	    	{
	    		System.out.print(x[i]+" ");
	    	}
	    }

 }
	static int[] insertArr(int[] arr,int in, int ele)
	{
		if(in<0||in >arr.length)
		{
			return null;
		}
		int[] br = new int [arr.length+1];
		br[in]=ele;
		for(int i=0;i<arr.length;i++ )
		{
			if(i<in)
				br[i]=arr[i];
			else
				br[i+1]=arr[i];
		}
		return br;
	}

}
