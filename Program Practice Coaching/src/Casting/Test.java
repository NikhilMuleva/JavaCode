package Casting;

//Upcasting:- Upcasting is process of assigned Child class object to Parent class Reference.
//          Upcasting is perform  in order to achieve " Generalization".

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike("Duke",225000);
	    Bike b2 = new Bike("Ninja",300000);
	    Laptop l1 = new Laptop("hp","black",45000);
	    Laptop l2 = new Laptop("dell","silver",50000);
	    
	    Object x[]= {b1 ,b2,  l1, l2}; //Upcasting 
	     for( int i=0;i<x.length;i++)
	     {
	    	 System.out.println(x[i]);
	    	 
	     }
	}

}
