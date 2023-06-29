package Student2;

public class NinjaH2 extends BikeOverride{
	@Override
	void topSpeed()
	{
		System.out.println("300KMPH");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NinjaH2 n = new NinjaH2();
		n.startEngine();
		n.stopEngine();
		n.topSpeed();
	

	}

}
