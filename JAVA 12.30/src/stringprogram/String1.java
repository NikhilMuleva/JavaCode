package stringprogram;
import java .util.Scanner;
public class String1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the sentences: ");
		String st = sc.nextLine();
		System.out.println(st.length());// length is count the number of character present u=in String
	    System.out.println(st.charAt(0));// charAt is check the index value of character present in string
	    System.err.println(st.charAt(5));
	    System.out.println(st.indexOf('i'));//indexOf is the give the indexOf values from the String where character is present 
	    System.out.println(st.indexOf('k'));
	    System.out.println(st.indexOf('m'));//indexOf is the give the indexOf values from the String where character is not present 
	                                          // give -1 values for character.
	}

}
