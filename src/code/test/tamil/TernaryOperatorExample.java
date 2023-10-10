package code.test.tamil;

public class TernaryOperatorExample {

	public static void main(String[] args) {

		//result = (Condition)? true: false;
		
		int num1 = 100;
		int num2 = 200;
		
		double result = (num1 > num2)? 1.5 : 2.5;
		System.out.println("result is : "+ result);
		
		String winner = (num1 < num2) ? "Viji" : "Tamilselvan";
		System.out.println("winner is : "+ winner);
		
		
//		if ( num1 > num2) {
//			System.out.println("result is "+ 1.5);
//		} else {
//			System.out.println("result is "+ 2.5);
//		}
//		
//		if ( num1 < num2) {
//			System.out.println("winner is : Viji");
//		} else {
//			System.out.println("winner is : Tamilselvan");
//		}
		
		
	}

}
