package Matrix;

public class SpiralMatrixAntiClock {
	
	public static void main(String[] args) {
		Matrix mt = new Matrix();
		int x[][]=mt.readMat();
		
		System.out.println("Enter the Spiral Matrix values");
		mt.printSpiral1(x);
		System.out.println("After the Spiral Matrix");
		mt.disMat(x);
		
	}

}
