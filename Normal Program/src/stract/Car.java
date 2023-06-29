package stract;

public abstract class Car {
	String name;
	int price;
	int n;
	
	 void disp()
	 {
		 System.out.println(this.name+" "+this.price);
	 }
	 void disp(int n)
	 {
		 System.out.println(n);
	 }
	 abstract void topSpeed() ;
	 abstract void topSpeed(int n);

}
