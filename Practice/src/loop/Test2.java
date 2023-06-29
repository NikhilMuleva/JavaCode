// case 4: Performing Multiple Task to Multiple Threads
package loop;

class MyThread1 extends Thread
{
  public void run()
  {
	  System.out.println("task1");
  }

}
class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("task2");
	}
}
class MyThread3 extends Thread
{
	public void run()
	{
		System.out.println("task3");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		MyThread2 t2 = new MyThread2();
		t2.start();
		
		MyThread3 t3 = new MyThread3();
		t3.start();

	}

}
