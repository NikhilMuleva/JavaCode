package loop;

public class PrioritiesMethods extends Thread {
	public void run()
	{
		System.out.println("child Thread");
		System.out.println("child Thread Priority "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread  Old Priority :"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(NORM_PRIORITY);
		System.out.println("Main Thread New Priority :"+Thread.currentThread().getPriority());
		
		PrioritiesMethods p = new PrioritiesMethods();
		p.setPriority(5);
		p.start();
		
		

	}

}
