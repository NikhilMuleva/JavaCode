package Matrix;


public class SpriralMatrix {
	
	public static void main(String[] args) {
		Matrix mt = new Matrix();
		int x[][]=mt.readMat();
		System.out.println("Enter the Spiral Matrix of  values");
		mt.printSpiral(x);
		System.out.println("After the Spiral the matrix");
		mt.disMat(x);
		
		
	}
	
}
