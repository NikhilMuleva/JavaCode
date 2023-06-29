package Casting;
//To solve class cast exception  Problem in "non-primitive method" we use "instanceof" using if-else condition.
public class VendingMa {
	Object order(int input)
	{
		if(input==1)
		{
			return new Coffee();
		}
		else
		{
			return new Tea();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMa  v= new VendingMa();
		Object x=v.order(1);
		if(x  instanceof Coffee)
		{
			Coffee c =(Coffee)x;
			c.coffeedetails();
		}
		else
		{
			Tea t = (Tea)x;
			t.teadetails();
		}

	}

}
