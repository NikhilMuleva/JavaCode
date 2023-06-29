package override;

public class Son extends Father {
	@Override
	int drink() //error
	 {
		 System.out.println("Tropicana");
		 return 10;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.drink();
		
		

	}

}
