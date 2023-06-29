
public class FibonacciRecursion {
	static int a=0,b=1 ,c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(a+" "+b);
		FibonacciRecursion ob = new FibonacciRecursion();
		ob.printFib(10);
		

	}
	void printFib(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			printFib(i-1);
			
		}
	}

}
