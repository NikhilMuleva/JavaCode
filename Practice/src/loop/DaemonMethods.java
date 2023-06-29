package loop;

public class DaemonMethods extends Thread {
	public void run()
	{
		System.out.println("daemon");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread");
		DaemonMethods t = new DaemonMethods();
		t.setDaemon(true);
		t.start();
		
	}

}
