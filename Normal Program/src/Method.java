
public class Method {
	String name;
	int yop;
	

	public Method(String name, int yop) {

		this.name = name;
		this.yop = yop;
	}
	 void details()
	 {
		 System.out.println(this.name);
		 System.out.println(this.yop);
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m = new Method("raju",2022);
		m.details();
	}

}
