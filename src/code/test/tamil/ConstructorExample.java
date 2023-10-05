package code.test.tamil;

public class ConstructorExample {
	
	String name;
	long accountNo;
	
	public ConstructorExample() {
		this.name ="default";
		this.accountNo = 1;
	}
	
	public ConstructorExample(String arg1) {
		this.name = arg1;
		this.accountNo = 1;
	
	}
	
	public ConstructorExample(String arg1, long arg2) {
		this.name = arg1;
		this.accountNo = arg2;
	}

	public static void main(String[] args) {
		
		//default constructor
		ConstructorExample obj1 = new ConstructorExample();
		ConstructorExample obj2 = new ConstructorExample("Viji");
		ConstructorExample obj3 = new ConstructorExample("Tamil", 1000);
		
		System.out.println("obj1 values are : " + obj1);
		System.out.println("obj2 values are : " + obj2);
		System.out.println("obj3 values are : " + obj3);
		
		
	}

	@Override
	public String toString() {
		return "ConstructorExample [name=" + name + ", accountNo=" + accountNo + "]";
	}
	
	

}
