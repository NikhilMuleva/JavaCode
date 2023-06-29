
public class EncapStudent {
	private String name;
	 private int age;
	 public void setName(String n)
	 {
		 this .name=n;
	 }
	 public void setAge(int a)
	 {
		 if(a>=1 && a<=19)
		 {
			 this.age=a;

		 }
		 else
		 {
			 System.out.println("invalid age"+ this.age);
		 }
		 
	 }
	 
	 public String getName()
	 {
		 return this.name;
	 }
	 public int getAge()
	 {
		 return this .age;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapStudent  s= new EncapStudent();
		s.setName("Nik");
		s.setAge(22);
		System.out.println(s.getName());
		System.out.println(s.getAge());

	}

}
