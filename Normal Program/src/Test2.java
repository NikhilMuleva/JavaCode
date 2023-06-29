
public class Test2 {
	String name;
	int age;
	
	Test2(String n)
	{
		this.name=n;
		
	}
	Test2 (int age)
	{
		this.age=age;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t= new Test2(21);
	    Test2 t1= new Test2("hello");
		System.out.println(t.age);
		System.out.println(t1.name);

	}

}
