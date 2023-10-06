package code.test.tamil.wrapperclasses;

public class StringExample {

	public static void main(String[] args) {

		
		String str1 = "India";
		String str2 = new String("Japan");
		
		System.out.println("charAt(2) in str1 is = " + str1.charAt(2));
		
		System.out.println("charAt(4) in str2 is = " + str2.charAt(4));
		
		System.out.println("concat of str1 and str2 is = " + str1.concat(str2));
		
		System.out.println("equals() = " + str1.equals(str2));
		
		System.out.println("equals() = " + str1.equals("India"));
		
		System.out.println("equals() = " + str1.equals("india"));
		
		
		
		
		
	}

}
