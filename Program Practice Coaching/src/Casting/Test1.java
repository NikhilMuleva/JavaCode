package Casting;
// If we are to solve Class Cast Exception problem so we are using "instanceof" by in if-else block.
//Class Cast Exception:-It is run time error which occurs  while performing Downcasting 
//if there are any type miss Match so that is called Class Cast Exception.


public class Test1 {

	public static void main(String[] args) {
		Bike b1 = new Bike("Duke",225000);
	    Bike b2 = new Bike("Ninja",300000);
	    Laptop l1 = new Laptop("hp","black",45000);
	    Laptop l2 = new Laptop("dell","silver",50000);
	    
	    Object x[]= {b1 ,b2,  l1, l2}; //Upcasting 
	     for( int i=0;i<x.length;i++)
	     {
	    	 if(x[i] instanceof Bike)
	    	 {
	    		Bike b= (Bike)x[i];
	    		System.out.println(b.name+" "+b.price);
	    		
	    	 }
	    	 else
	    	 {
	    		 Laptop l =(Laptop)x[i];
	    		 System.out.println(l.brand+" "+l.color+" "+l.price);
	    		 
	    	 }
	    	 
	     }

	}

}
