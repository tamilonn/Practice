package code.test.tamil.exceptions;

public class BasicExceptionExample {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 2;
		int num3 = 0;
		
		runDivision(num1, num2, num3);

	}

	private static void runDivision(int num1, int num2, int num3) {
		
		int result = -1;

		
		try {
			result = num1 / num2;
			
			if (num3 == 0 ) {
				throw new MyOwnException(10001,"Sorry, please try again later");
			}
		}catch (ArithmeticException ae) {
			System.out.println("Exception occured. Check your program");
		}catch(MyOwnException moe) {
			System.out.println("Error occured. ErrorCode= " +moe.getErrorCode() + " msg= " + moe.getErrorMessage());
		}
		
	
		
		System.out.println("Resut is num1 / num2 = " + result);
		
		
		
	}

}
