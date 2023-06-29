package loop;

public class Interrupted extends Thread{
	public void run()
	{
		//System.out.println("A  :"+Thread.interrupted());
	    System.out.println("a :"+Thread.currentThread().isInterrupted());
	    
	    //System.out.println("b :"+Thread.currentThread().isInterrupted());
	    
	    
		
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
				//System.out.println("B :"+Thread.interrupted());
			}
		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted: "+e);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Interrupted I = new Interrupted();
	     I.start();
	     I.interrupt();
	

	}

}
