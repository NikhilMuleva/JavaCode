package loop;

public class Multi2 implements Runnable {
	public void run()
	{
		System.out.println("thread is running");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi m = new Multi();
		Multi2 t = new Multi2();
		t.start();

	}

}
