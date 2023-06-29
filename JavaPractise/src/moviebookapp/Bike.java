package moviebookapp;

public class Bike {
	String name;
	String Color;
	int price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = new Bike();
		b1.name="Himalyan"; 
		b1.Color="white";
		b1.price=30000;
		
		b2.name="R15"; b2.Color="Blue"; b2.price=200000;
		b3.name="Duke";b3.Color="Orange"; b3.price=2500000;
		 
		System.out.println(b1.name);
		System.out.println(b1.Color);
		System.out.println(b1.price);
		
		
		System.out.println("\n");
		
		System.out.println(b2.name);
		System.out.println(b2.Color);
		System.out.println(b2.price);
		
		System.out.println("\n");
		
		System.out.println(b3.name);
		System.out.println(b3.Color);
		System.out.println(b3.price);



	}

}
