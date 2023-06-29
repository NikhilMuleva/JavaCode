
public class Pizza {
	String type ="Regular";
	String toping1;
	String toping2;
	boolean cheese;
	int price=150;
	
	//Regular Pizza with cheese optional
	Pizza(boolean cheese)
	{
		this.cheese=cheese;
		if(cheese==true) 
		{
			this.price=this.price+60;
		}
	}
	
	//Regular Pizza with toping & cheese optional
	Pizza(String toping1,boolean cheese)
	{
		this.toping1=toping1;
		this.cheese=cheese;
		if(cheese=true)
		{
			this.price=this.price+40+60;
		}
		else
		{
			this.price=this.price+40;
		}
	}

	// Regular Pizza with toping1 ,toping2 and cheese optional.
	Pizza(String toping1,String toping2,boolean cheese)
	{
		this.toping1=toping1;
		this.toping2=toping2;
		this.cheese= cheese;
		if(cheese==true)
		{
			this.price=this.price+70+60;
		}
		else
		{
			this.price=this.price+70;
		}
	}
	

	void bill()
	{
		double gst=0.18+this.price;
		double total= gst + this.price;
		System.out.println("type "+this.type);
		System.out.println("toping1 "+this.toping1);
		System.out.println("toping2 "+this.toping2);
		System.out.println("cheese "+this.cheese);
		System.out.println("price "+this.price);
		System.out.println("gst "+gst);
		System.out.println("Total "+total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1 = new Pizza(true);
		Pizza p2 = new Pizza("Panner",true);
		Pizza p3 = new Pizza("Panner","onion" ,true);
		
		p1.bill();
		System.out.println();
		
		p2.bill();
		System.out.println();

		p3.bill();
		System.out.println();

		

	}

}
