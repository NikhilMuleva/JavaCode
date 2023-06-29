package loop;

public class Join extends Thread {
	public void run()
	{
		try
		{
			for(int i=1 ;i<=5;i++)
			{
				System.out.println("child thread :"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Join j = new Join();
		j.start();
		j.join();
		try
		{
			for(int i=1 ;i<=5;i++)
			{
				System.out.println("Main thread :"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
