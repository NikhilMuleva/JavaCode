
package Student2;



class Student { 
	int x=100;
	static int y=202;
	void dispaly()
	{
		System.out.println(x);
		System.out.println(y);
	}
	static void display()
	{
		System.out.println(y);
	}
	

}
 class Student2{
	 public static void main(String[] args) {
		 Student s = new Student();
		 
		Student2 s2= new Student2();
		s.dispaly();
		
	}
	
}