package Apple;
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

 