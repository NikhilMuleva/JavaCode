package moviebookapp;
class TotalEarning extends Thread
{
	int total =0;
	public void run()
	{
		synchronized (this) {
		for(int i=1;i<=10;i++)
		{
			total=total+100;
		}
		this.notify();
	}
}

	public class MovieBookAppp
	{

		public static void main(String[] args) throws Interrupted Exception {
			// TODO Auto-generated method stub
			TotalEarning te = new TotalEarning();
			te.start();


			synchronized(te)
			{
				te.wait();
				System.out.println("total earning: "+te.total);

			}
			System.out.println("total earning :"+te.total);

		}

	}
