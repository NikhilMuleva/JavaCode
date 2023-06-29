import java.util.Scanner;
public class MiddelNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if(a>b)
        {
        	if(b>c)
        	{
            	System.out.println(b+" b is Middel num");
        	}
        	else if(c>a)
        	{
        		System.out.println(a+" a is Middel number");
        	}
        	else
        	{
        		System.out.println(c+" c is Middle num");
        	}
        }
        else
        {
        	 if(b<c)
        	 {
        	        System.out.println(b+"  b is a middle number");
        	    }
        	    else if(c<a){
        	        System.out.println(a+" a is a middle number");
        	    }
        	    else{
        	        System.out.println(c+" c is a middle number");
        	    }
        }
        
        	
		}
}
