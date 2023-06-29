package Array;
/// In this Program Using toString Method In the program.

public class Employee1 {
	String name;
	int sal;
	public String toString()
	{
		return this.name+" "+this.sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1();
		e1.name="Rahul"; e1.sal=25000;
		System.out.println(e1);
	}

}
