package stringprogram;

public class String2 {

	public static void main(String[] args) {
      String s="nikhil";
      char ch[] =s.toCharArray();    // Convert String to Array
      for(int i=0;i<ch.length;i++)
      {
    	  System.out.println(i+"of  "+ch[i]);
      }
      
      char c[]= {'n','i','k','h','i','l'};
      String st = new String (c);       // Convert Array to String
      System.out.println(st);
      
	}

}
