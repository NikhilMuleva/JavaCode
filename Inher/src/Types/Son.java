package Types;

public class Son extends father {
	@Override
	void drink()
	{
		System.out.println("yrel");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.drink();
	//	father f = new father();
		//f.drink();
	

	}

}
