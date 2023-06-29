package loop;
public class MovieBookApp extends Thread {
	static BookTheaterSeat b;
	int seats ;
	public void run()
	{
		b.bookSeat(seats);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method 
		b= new BookTheaterSeat();
		MovieBookApp Nik= new MovieBookApp();
		Nik.seats=7;
		Nik.start();

		MovieBookApp M = new MovieBookApp();
		M.seats=6;
		M.start();


	}

}

public class BookTheaterSeat 
{
	int total_seats=10;
	synchronized void bookSeat(int seats)
	{
		if(total_seats>=seats)
		{
			System.out.println(seats+"seats booked Successfully");
			total_seats=total_seats-seats;
			System.out.println("seats left : "+total_seats);

		}
		else
		{
			System.out.println("Sorry seats cannot  be booked...");
			System.out.println("seats left:"+total_seats);
		}
	}
}


