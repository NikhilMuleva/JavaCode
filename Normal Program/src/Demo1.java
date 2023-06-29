
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		try {
			System.out.println("Try block start");
			System.out.println(100/0);//arithmetic exception
			int x[]= {};
			System.out.println(x[2]);
			System.out.println("try blcok end");
		}
		catch(ArrayIndexOutOfBoundException e){
			System.out.println("array index");
			
			 
		}
		catch(AirthmeticException e) {
			System.out.println("airthmentic");
		}
		catch(Throwable e) {
			System.out.println("this an exception");
		}

	}

}
