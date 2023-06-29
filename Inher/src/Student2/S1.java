package Student2;

public class S1 extends F1 {
	@Override
	int drink()//error
	{
		System.out.println("s1");
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       S1 s= new S1();
        int a= s.drink();
        System.out.println(a  );

	}

}
