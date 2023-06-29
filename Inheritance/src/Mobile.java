 public class Mobile
{
	String model;
	String color;
	int price;
	int ram;

	Mobile(String m ,String c, int p,int r)
	{
		this.model=model;
		this.color=color;
		this.price=price;
		this.ram=ram;
	}
	
	void details()
	{
		System.out.println("model "+ this.model);
		System.out.println("color "+ this.color);
		System.out.println("price "+ this.price);
		System.out.println("ram "+ this.ram);
	}


}

 class Apple extends Mobile
{
	 
	Apple(String m, String c, int p, int r) {
		super(m, c, p, r);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Apple a1 = new Apple("iphone","hot pink",189000,4);
		a1.model="Iphone";
		a1.color="hot pink";
		a1.price=189000;
		a1.ram=4;
		a1.details();
		
		
	}
}

 