package stract;

public abstract class Employee {
	private int id;
	private String eName;
	public Employee(int id, String eName) {
		this.id = id;
		this.eName = eName;
		System.out.println(this.id +" "+this.eName);

	}
	


}
