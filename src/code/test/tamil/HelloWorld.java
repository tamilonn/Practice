package code.test.tamil;
public class HelloWorld {
	
	static String message = "Hello aunt";

	public static void main(String[] args) {
		
		System.out.println(message);
		
		sayHelloAgain();
		
//		singHello();
		
		HelloWorld object = new HelloWorld();
		object.singHello();

		System.out.println("End of Program");
		
      
	}
	
	private static void sayHelloAgain() {
		
		System.out.println("Hi Hello Again");
	}
	
	
	private void singHello() {
		System.out.println("Im singing hello song...");
	}

}
