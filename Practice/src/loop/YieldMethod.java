package loop;

public class YieldMethod extends Thread{
	public void run()
	{
		Thread.yield();
		for(int i= 1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldMethod y = new YieldMethod();
		y.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}

		
				

	}

}
