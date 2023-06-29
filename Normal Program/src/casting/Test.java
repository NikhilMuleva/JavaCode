package casting;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike("duke",23777777);
		Bike b2 = new Bike("Ninja",876544);
		Laptop l1 = new Laptop("hp",2300000);
		Laptop l2 = new Laptop("dell", 5000000);
		
		Object x[]= {b1,b2,l1,l2};
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]+" ");
		}
		
		System.out.println(b1.name+" "+b1.price+" "+l1.brand+" "+l1.price);
		System.out.println(b2.name+" "+b2.price+" "+l2.brand+" "+l2.price);


	}

}
