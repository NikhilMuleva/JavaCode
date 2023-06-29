package stract;
interface father{
	abstract void careF();
}

interface mother{
	abstract void careM();
}

public class Son implements father,mother{
	Son(){
		super();
		System.out.println("son");
	}
	@Override
	public void careF()
	{
		System.out.println("father");
	}
	@Override
	 public void careM()
	{
		System.out.println("Mother method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.careF();
		s.careM();

	}

}
