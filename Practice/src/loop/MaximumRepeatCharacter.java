//Program to find Maximum Occurring Character in String
package loop;

public class MaximumRepeatCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is demo";
		int arr[]= new int[127];
		
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}
		int max=-1;
		int c=' ';
			
		for(int i=0;i<s.length();i++)
		{
			if(max<arr[s.charAt(i)])
			{
				max=arr[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		
		System.out.println("maximum repeated character is "+c);

	}

}
