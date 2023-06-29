package stringprogram;

public class Demo 
{ 
   static String swap_chars(String my_str) 
   { 
      char[] my_ch = my_str.toCharArray(); 
      for (int i = 0; i < my_ch.length; i++) 
      { 
         int k = i; 
         while (i < my_ch.length && my_ch[i] != ' ')  
            i++; 
           
         char temp = my_ch[k]; 
         my_ch[k] = my_ch[i - 1]; 
         my_ch[i - 1] = temp; 
 
      } 
      return new String(my_ch); 
   } 
   public static void main(String[] args) 
   { 
      String my_str = "Thas is a sample"; 
      System.out.println("The string after swapping the last characters of every word is : ");
      System.out.println(swap_chars(my_str)); 
   } 
}