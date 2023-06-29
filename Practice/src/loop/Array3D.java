package loop;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a= {{{10,20},{30,40,50},{70,80,90,45}}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			
		}
		print();
	}
static void print()
{
	int a=13;
	int b=21;
	final long xor=a^b;
	final long and=(a&b)*2;
	System.out.println(xor+and);
}
}
