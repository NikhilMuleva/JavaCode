package Matrix;
//Define a method rotates the Matrix element to 90 degree left and 90 degree right

public class MatrixRotate90Degree {

	public static void main(String[] args) {
		Matrix mt= new Matrix();
		int x[][]=mt.readMat();
		x=mt.rotate90Left(x);
		System.out.println("After the Roate 90 Degree left Matrix: ");
		mt.disMat(x);
		
		int y[][]=mt.readMat();
		x=mt.rotate90Left(x);
		System.out.println("After the Roate 90 Degree left Matrix: ");
		mt.disMat(x);


	}

}
