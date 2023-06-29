
public class Static1 {
	static int x=10;
	
	static 
	{
		System.out.println(x);
		x=x+1;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("x  "+x);

	}

}
