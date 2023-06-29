// This Synchronized is used for Synchronized Block

package moviebookapp;



class BookTheaterSeat1
{
	int total_seats=10;
	public void bookSeat1(int seats)
	{
		 System.out.println("Hii : "+Thread.currentThread().getName());
		 System.out.println("Hii : "+Thread.currentThread().getName());
		 System.out.println("Hii : "+Thread.currentThread().getName());
		 System.out.println("Hii : "+Thread.currentThread().getName());
		 System.out.println("Hii : "+Thread.currentThread().getName());
		 System.out.println("Hii : "+Thread.currentThread().getName());
		 
		 
		 synchronized(this)
		 {
			 if(total_seats>=seats)
			 {
				 System.out.println(seats+  " seats booked Successfully");
				 total_seats=total_seats-seats;
				 System.out.println("seats left : "+total_seats);

			 }
			 else
			 {
				 System.out.println("Sorry seats cannot  be booked...");
				 System.out.println("seats left:"+total_seats);
			 }
		 }
		 System.out.println("Hii : "+Thread.currentThread().getName());
		 System.out.println("Hii : "+Thread.currentThread().getName());
		 System.out.println("Hii : "+Thread.currentThread().getName());
	}
}

public class MoiveBookApp1{
	static BookTheaterSeat1 b;
	int seats ;
	public void run()
	{
		b.bookSeat1(seats);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b= new BookTheaterSeat1();
		MovieBookApp1 R = new MovieBookApp1();
		R.seats=7;
		R.start();
		
		MoiveBookApp1 N = new MovieBookApp1();
		N.seats=6;
		N.start();
	}

}
