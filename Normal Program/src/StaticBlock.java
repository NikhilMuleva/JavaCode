
public class StaticBlock {
	static int x;
	
	static
	{
		System.out.println("static block");
		x=100;	
		System.out.println(x);
	}
	static {
		x=100;	
		System.out.println(x);

		System.out.println("ram ram");
	}
		
		public static void main(String[] args) {
			System.out.println("jay hind");
			
		}
	static {
		System.out.println("hello");
	}

}
