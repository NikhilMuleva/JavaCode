package loop;
//case2: Performing single task to multiple Threads



public class Test extends Thread {
	public void run()
	{
		System.out.println("task1");
	}

	public static void main(String[] args) {
		// TODO  Auto-generated method stub
        Test t1= new Test();
        t1.start();
        Test t2 = new Test();
        t2.start();
        	}

}
