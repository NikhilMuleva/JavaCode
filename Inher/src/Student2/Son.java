package Student2;

public class Son extends Father {
	 void drink()
	 {
		 System.out.println("Tropicana");
		 
	 }
	  void learn()
	  {
		  System.out.println(" Python");
	  }
	  public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.money);
		System.out.println(s.car);
		s.drink();
		s.learn();
	}

}
