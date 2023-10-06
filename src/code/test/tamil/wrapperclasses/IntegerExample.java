package code.test.tamil.wrapperclasses;

public class IntegerExample {

	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println("i = " + i);
		
		Integer intObj = 10;
		System.out.println("intObj = " + i);
		
		System.out.println("primitive int value is = " + intObj.intValue());
		
		System.out.println("primitive double value is = " + intObj.doubleValue());
		
		System.out.println("Integer.max value is = " + Integer.max(201, 301));
		
		System.out.println("Integer.min value is = " + Integer.min(201, 301));

	}

}
