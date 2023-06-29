package Types;

public class Types2 extends Type1{
	String work;
	void show() {
		System.out.println("show tiem");
	}
	public static void main(String[] args) {
		Types2 t = new Types2();
		t.name="nik";
		t.age=22;
		System.out.println(t.name);
		System.out.println(t.age);
		t.disp();
		t.show();
		
		
	}
}
