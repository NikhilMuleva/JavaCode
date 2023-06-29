
public class Employee {
	String name;
	String company;
	int salary;
	Employee(String n,String c,int s)
	{
		this.name= n;
		this.company=c;
		this.salary=s;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1 = new Employee("rakesh","Tcs",25000);
       Employee e2 = new Employee("rohan","wipro",27000);
       
       
       Employee e3 = new Employee("Raju","infosys",30000);
      
       
       
       System.out.println(e1.name);
       System.out.println(e1.company);
       System.out.println(e1.salary);
       
       System.out.println(e2.name);
       System.out.println(e2.company);
       System.out.println(e2.salary);
       
       System.out.println(e3.name);
       System.out.println(e3.company);
       System.out.println(e3.salary);
       
	}

}
