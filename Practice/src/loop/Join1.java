package loop;

public class Join1 extends Thread {
	static Thread mainthread;
	public void run()
	{
		try
		{
			mainthread.join();
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
		mainthread=Thread.currentThread();
		Join1 j = new Join1();
		j.start();
		
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
