package Student2;

public class Hayabusa extends BikeOverride {
	@Override
	void topSpeed()
	{
	 System.out.println("350Kmph");	
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hayabusa h = new Hayabusa();
		h.topSpeed();
	}

}
