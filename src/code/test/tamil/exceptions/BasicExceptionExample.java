package code.test.tamil.exceptions;

public class BasicExceptionExample {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 0;
		
		runDivision(num1, num2);

	}

	private static void runDivision(int num1, int num2) {
		
		int result = -1;
		try {
			result = num1 / num2;
		}catch (ArithmeticException ae) {
			System.out.println("Exception occured. Check your program");
		}
		
	
		
		System.out.println("Resut is num1 / num2 = " + result);
		
		
		
	}

}
