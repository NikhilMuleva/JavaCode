 // Variable Shadowing-whenever the global and local varaiable are same within the member ,local variable dominates over
// global variable . In order to differentiate  b/w Global and local variable we  use of "this "Keyword.
public class Vshadowing {
	String drink="checkpost coffee";
	void jspider()
	{
		String drink="jspider coffe";
		System.out.println("jsp"+drink);
		System.out.println( this.drink);
				
	}
	
	void company()
	{
		System.out.println("company "+drink);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vshadowing v= new Vshadowing();
		v.jspider();
		v.company();

	}

}
