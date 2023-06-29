package Student2;

 class Bike extends Vehicle
{
	 public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.name="RE";
		b1.price=1890000;
		System.out.println(b1.name);
		System.out.println(b1.price);
		b1.startEngine();
		b1.stopEngine();
	}
}




