package Array;

public class Lipstick {
	String Brand ,shade;
	int price;
	

	public Lipstick(String brand, String shade, int price) {
		super();
		 this.Brand = brand;
		this.shade = shade;
		this.price = price;
	}
	//@override
	public String toString() {
		return this.Brand+" "+this.shade+" "+this.price;
	}

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		Lipstick l1 = new Lipstick("Lackme","Red",450);
		Lipstick l2 = new Lipstick("Mac","Pink",500);
		Lipstick l3 = new Lipstick("Assianpaint","black",600);
		
		Lipstick x[]= { l1, l2 ,l3};
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}

}
