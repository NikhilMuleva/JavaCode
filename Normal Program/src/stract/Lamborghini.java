package stract;

 public class Lamborghini extends Car {
	 @Override
	 public void topSpeed()
	 {
		 System.out.println("320 Kmph");
	 }
	// @Override
	// public void topSpeed(int n) {
		 //System.out.println(n);
	 //}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamborghini l1 = new Lamborghini();
		l1.name="Niko";
		l1.price=239000;
		l1.disp();
		l1.topSpeed();
		l1.disp(5);
	    
		}

}
