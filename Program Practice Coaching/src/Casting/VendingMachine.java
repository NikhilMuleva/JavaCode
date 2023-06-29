package Casting;
// Non-Primitive Return Type Method.c
public class VendingMachine {
	Coffee button1()
	{
		Coffee c1 = new Coffee();
		return c1;
		
	}
	Tea button2()
	{
		Tea t1 = new Tea();
		return t1;
		 
		
	}
	
	
	public  static void main(String[] args)
	{
		VendingMachine v = new VendingMachine();
		 Coffee x=v.button1();
		 System.out.println(x);
		 Tea y=v.button2();
		 System.out.println(y);
		 
		
	}

}
