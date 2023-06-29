
public class Test {
	void square(int num)
	{
		int res = num*num;
		System.out.println(res);
	}
	void cube(int num)
	{
		int res = num*num*num;
		System.out.println(res);
	}
	void circle(int r)
	{
		 double res;
		double pi=3.147;
		res= pi*r*r;
		System.out.println(res);
		
	}
	 void triangle(int base,int height)
	 {
		 double d=0.5;
		 double res=0.5* base*height;
		 System.out.println(res);
	 }
	 
	 void Rectangle(int length,int breadth)
	 {
		 int res = length*breadth;
		 System.out.println(res);
	 }
	  void areaofsquare(int side)
	  {
		  int res = side*side;
		  System.out.println(res);
		  
	  }
	  
	  
	  
	  void percentage(int physics ,int chemistry, int maths)
	  {
		  int total= physics+chemistry+maths;
		  double pc=total*100/300;
		  System.out.println(pc);
	  }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.square(2);
		t.cube(4);
		t.circle(4);
		t.triangle(4, 5);
		t.Rectangle(5, 4);
		t.areaofsquare(4);
		
		t.percentage(50, 50, 50);

	}

}
