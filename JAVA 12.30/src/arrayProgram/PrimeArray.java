package arrayProgram;

public class PrimeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperation ao= new ArrayOperation();
		int[] x=ao.readArray();
		System.out.println("uesr enter the array: ");
		ao.dispArray(x);
		int pc = ao.countPrime(x);
		System.out.println("Numbers of prime: "+pc);
	}

}
