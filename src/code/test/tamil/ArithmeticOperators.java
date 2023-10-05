package code.test.tamil;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int no1 = 500;
		int no2 = 25;
		
		System.out.println(add(500, 25));
		System.out.println(substract(500, 25));
		System.out.println(multiply(500, 25));
		System.out.println(divide(500, 25));
		System.out.println(modulus(500, 25));

	}

	private static int modulus(int i, int j) {
		// TODO Auto-generated method stub
		return i % j;
	}

	private static int divide(int i, int j) {
		// TODO Auto-generated method stub
		return i / j;
	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		return i * j;
	}

	private static int substract(int i, int j) {
		// TODO Auto-generated method stub
		return i - j;
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

}
