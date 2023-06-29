package Array;

public class Watch {
	String brand,color;
	int price;
	

	public Watch(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	 void details() {
		 System.out.println(this.brand+" "+this.color+" "+this.price);
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch w1 = new Watch("Titan","Silver",5300);
		Watch w2 = new Watch("Sonata","Gold",6000);
		Watch w3 = new Watch("Fastrack","red",5600);
        
		Watch w[]={ w1, w2, w3};
		 for(int i=0;i<=w.length;i++)
		 {
		   w[i].details();
		   
		 }
		

	}

}
