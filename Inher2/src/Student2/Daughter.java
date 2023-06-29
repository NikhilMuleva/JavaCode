package Student2;

public class Daughter extends Father{
	 void drink()
	 {
		 System.out.println("horlicks");
	 }
	 void learn()
	 {
		 System.out.println("SQL");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d = new Daughter();
		System.out.println(d.money);
		System.out.println(d.car);
		d.drink();
		d.learn();

	}

}
