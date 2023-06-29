package Array;

public class Employee {
	String name,company;
	int salary;
	

	public Employee(String name, String company, int salary) {
		super();
		this.name = name;
		this.company = company;
		this.salary = salary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Nikhil","Wipro",50000);
		Employee e2 = new Employee("Gour","Gyansage",40000);
		Employee e3 = new Employee("Mohit","Capgi",45000);
		Employee e4 = new Employee("Mahendra","Wipro",56000);
		
		Employee e[]= { e1, e2, e3 , e4};
		 for(int i=0;i<e.length;i++)
		 {
			 System.out.println(e[i].name+" "+e[i].company+" "+e[i].salary);
		 }
		 System.out.println();
		 System.out.println();

		 for(int i=0;i<e.length;i++)
		 {
			 if(e[i].salary>25000) {
				 System.out.println(e[i].name+" "+e[i].salary);
			 }
		 }
	}

}
