package Matrix;
//Define a method to row wise reverse matrix and column wise Reverse
public class MatrixReverseRowColWise {

	public static void main(String[] args) {
		Matrix mt = new Matrix();
		int x[][]=mt.readMat();
		x=mt.rowReverse(x);
		System.out.println("After the Row  wise reverse Matrix");
		mt.disMat(x);
		
		int y[][]=mt.readMat();
		y=mt.colReverse(y);
		System.out.println("After the Coulmn Wise Reverse matrix");
		mt.disMat(y);
		
	}

}
