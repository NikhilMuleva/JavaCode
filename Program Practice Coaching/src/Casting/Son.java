package Casting;
//Downcasting:-
// It is process of re-assigned to the object from Parent Type to Specific Child Type.

public class Son extends Father{
	String bike ="Himalyan"; // Specific Properties.
	void exercise()          // Specifice Behaviours.
	
	{
		System.out.println("Exercise");
	}


	public static void main(String[] args) {
		Father f = new Son();  //Upcasting
		System.out.println(f.money);
		f.learn();
	//	f.exercise();  // If Father(Parent class) is Not access the Child class Specific properties
		               //  and Specific Behaviours.To Avoid this problem we go for the Concept call
		               // Downcasting.
		//Son s=f;
		Son s =(Son)f; //Downcasting.
		System.out.println(s.bike); //Son 
		s.exercise(); //son
        
	}

}

//
