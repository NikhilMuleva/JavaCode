package Matrix;
//Define a method to Transpose The Matrix

public class TransposeMatrix {

	public static void main(String[] args) {
		Matrix mt = new Matrix();
		int x[][]=mt.readMat();
		x=mt.transpose(x);
		System.out.println("After the transpose matrix: ");
		mt.disMat(x);
		

	}

}
