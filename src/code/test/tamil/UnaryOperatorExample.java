package code.test.tamil;

public class UnaryOperatorExample {

	public static void main(String[] args) {

		int num1 = 25;
		int num2  = 35, result = 0;
		
		System.out.println("variables are num1 = "+ num1 + ", num2 = " + num2);
		
		//Using minus operator (-)
		//making positive number num1 to negative number
		result = -num1;
		System.out.println("Positive to Negative number = " + result);
		
		//making positive number num1 to negative number
		
		int result2 = -result;
		System.out.println("Negative number to Positive number = " + result2);
		
		System.out.println("-----------------------------------------------------= ");
		
		//Using NOT operator (!)
		
		boolean flag = true;
		System.out.println("bool1 = "+ flag);
		
		boolean result3 = !flag;
		System.out.println("NOT of bool1 = "+ result3);
		
		System.out.println("NOT of result3 = "+ !result3);
		
		//Using increment operator (++)
		
		int incr = 10;
		int incrResult = ++incr;
		System.out.println("Increment of 10 = " + incrResult );
		
		//Using increment operator (--)
		
		int decr = 10;
		int decrResult = --decr;
		System.out.println("Decrement of 10 = " + decrResult );
		
	}

}
