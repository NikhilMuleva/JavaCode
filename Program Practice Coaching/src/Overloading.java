     

// "Method Overloading are Multiple types of use multiple parameter and multiple datatypes";
public class Overloading {
	void disp()
	{
	  System.out.println("hello");	
	}
	void disp(int x)
	{
		System.out.println("x"+x);
		
	}
	 void disp(int x,String y)
	 {
		 System.out.println(x+" "+y);
	 }
	  void disp(String y,int x)
	  {
			 System.out.println(y+" "+x);

	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o = new Overloading();
		o.disp();
		o.disp(67);
		o.disp(78, "hello");
		o.disp("Java", 67);

	}

}
