///constructor
public class Bike {
	String name;
	int price;
	Bike(String name ,int price)
	{
		this.name=name;
		this.price=price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bike b1 = new Bike("Honda",100000);
      System.out.println(b1.name);
      System.out.println(b1.price);
	}

}
