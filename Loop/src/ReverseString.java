/*
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="nikhil muleva";
		int leng = name.length();
        String rev= " ";
        for(int i=leng-1;i>=0;i--)
        {
        	rev=rev+name.charAt(i);
        }
        System.out.println("Reverse of :" +name+ " is " +rev);
	}

}*/





public class ReverseString
{
	public static void main(String[] args) {
		String name= "hello";
		int leng= name.length();
		String rev= " ";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("reverse String : "+name+"is "+rev);
	}
}