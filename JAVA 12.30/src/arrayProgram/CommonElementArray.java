package arrayProgram;
//Define a method to return the common element b/w two arrays. 

public class CommonElementArray {
	static int[] interSection(int[] a, int[] b) {
		int x[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if (a[i]==b[j])
				{
					x[k]=a[i];
					k++;
					break;
				}
			}
		}
		int rs[]= new int[k];
		for(int i=0;i<k;i++)
		{
			rs[i]=x[i];
		}
		return rs;
	}


	public static void main(String[] args) {
		int a[]= {34,56,45,78,54};
		int b[]= {87,23,56,87,78,32};
		int c[]= interSection(a,b);
		System.out.println("Common elements");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}		

	}
}
