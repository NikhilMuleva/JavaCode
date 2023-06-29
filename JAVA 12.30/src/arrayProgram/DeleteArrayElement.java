package arrayProgram;

public class DeleteArrayElement {

	public static void main(String[] args) {
		int x[]= {23,56,39,78,85,57};
		x =deleteArray(x,2);
		if(x==null)
		{
			System.out.println("index is not in range");
		}
		else {
			System.out.println("After the delete");
			for(int i=0;i<x.length;i++)
			{
				System.out.println(x[i]+" ");
			}
		}

	}
	static int[] deleteArray(int ar[],int in)
	{
		if(in<0 || in>=ar.length)
			return null;
		
		int[] br=new int[ar.length-1];
		for(int i=0;i<ar.length-1;i++)
		{
			if(i<in)
				br[i]=ar[i];
			else
				br[i]=ar[i+1];
		}
		return br;
	}

}
