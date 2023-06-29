//Find The Element That Appears Once In An Array Where Every Other Element Appears Twice in Java
// exmaple (4,3,2,5,4,6,5,3,7,1,7)
// ouput=  '1
public class SingleRepeatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,6,7,5,3,4,5,2,3,4};
		int res =a[0];
		for(int i=1;i<a.length;i++)
		{
			res=res^a[i];
		}
		System.out.println("Single Repeated Element is :" +res);

	}

}
