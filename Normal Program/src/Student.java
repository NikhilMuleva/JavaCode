
public class Student {
	String name;
	int phy,che,maths;
	

	public Student(String name, int phy, int che, int maths) {
		this.name = name;
		this.phy = phy;
		this.che = che;
		this.maths = maths;
	}

	 void marks()
	 {
		 System.out.println("Physics "+this.phy);
		 System.out.println("Chemistry "+this.che);
		 System.out.println("Maths  "+this.maths);
	 }
	 
	 int totalMarks()
	 {
		 int total=this.phy+this.che+this.maths;
		 return total;
	 }

	 double percentage()
	 {
		 int t= this.totalMarks();
		 double perc=t/300.0*100.0;
		 return perc;
	 }
	 
	 void details()
	 {
		 System.out.println("Name "+this.name);
		 this.marks();
		 System.out.println("Total marks "+this.totalMarks());
		 System.out.println("Percentage "+this.percentage());
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("rahul",75,54,95);
		s1.details();

	}

}
