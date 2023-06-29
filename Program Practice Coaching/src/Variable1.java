
// 1.Two Global variable cannot have same name irrespective of datatypes.

public class Variable1{
	//int x=100;
	//String x="java"; // error
	
	String sub;// 2.Global Variable declared inside the class outside the member but it can be initialized
	void disp() // inside the member of class.           
	{
		sub ="java";
		int x=100; // 4.inside the same member two local varaible cannot have irrespective of Datatypes.
		//String x="java"; //4.duplicated variable
		System.out.println(x);
		System.out.println(sub);// 2.Global variable Initialized.
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable1 v1 = new Variable1();
         v1.disp();
	}

}
