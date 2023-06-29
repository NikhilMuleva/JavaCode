package Student2;

 class Car extends Vehicle {
	 public static void main(String[] args) {
		Car c1 = new Car();
		c1.name="Audi";
		c1.price=7000000;
		System.out.println(c1.name);
		System.out.println(c1.price);
		c1.startEngine();
		c1.stopEngine();
	}

}
