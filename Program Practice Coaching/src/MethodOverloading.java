
public class MethodOverloading {
	void Disp(int x)
	{
		System.out.println("Display-1");
		
	}
	void Disp(byte b)
	{
		System.out.println("Display-2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m1 = new MethodOverloading();
		m1.Disp(100);
		byte x=100;
		m1.Disp(x);
		

	}

}
