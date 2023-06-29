package Array;

public class Bike {
	String name, color;
	int price;
	public Bike(String name,String color,int price) 
	{
		this.name=name;
		this.color=color;
		this.price=price;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike("Duke","Orange",2500000);
		Bike b2 = new Bike("R15","Blue",2150000);
		Bike b3 = new Bike("RE","red",31500000);
		Bike b4= new Bike("Hero","Black",100000);
		
		Bike b[]= {b1 ,b2, b3, b4};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i].name+" "+b[i].color+" "+b[i].price);
		}	

	}

}
