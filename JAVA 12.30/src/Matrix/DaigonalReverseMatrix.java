package Matrix;

//Write a code to daigonal wise reverse matrix
public class DaigonalReverseMatrix {
	 
	public static void main(String[] args) {
		Matrix mt= new Matrix();
		int[][] x=mt.readMat();
		System.out.println("user enter the Matrix");
		mt.daigonalReverse(x);
		System.out.println("after the daigonal reverse");
		mt.disMat(x);		

	}

}

// Output:-
//1 2 3 
//4 5 6 
//7 8 9 
//user enter the Matrix
//after the daigonal reverse
//9 2 7 
//4 5 6 
//3 8 1 

