
public class MethodOverloading {
	void disp()
	{
		System.out.println("hello");
	}
	 
	void disp(int n)
	{
	  System.out.println(n);
	}
	
	void disp(String s)
	{
		System.out.println("hello");;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m= new MethodOverloading();
		m.disp();
		m.disp(3);
		m.disp("hello");
		
	}

}
