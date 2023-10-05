package code.test.tamil;

public class AccessModifiersExample {
	
	

	public static void main(String[] args) {
		System.out.println("starting....");
		
		Person p1 = new Person();
		p1.setDiamond("RED Diamond");
		

		
		System.out.println(p1);
		
		print("Viji");
		
		HDFCBank hdfcBank = new HDFCBank();
		hdfcBank.print("HDFCBank value");
		
	}
	
	
	private static void print(String value) {
		
		System.out.println("private method values is :" + value);
		
	}
	

}

	