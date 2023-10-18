package code.test.tamil.classDataType;

public class SimpleClass {
	
	
	
	
	private int i = 100;
	
	private String str = "Hellow WOrld";
	
	private char myChar = '$';
	
	private int myAge = 48;
	
	private double rate = 158.67;
	
	private String myStudent = "Viji";
	
	private boolean isHappy = true;
	
	private Integer objInt = 100;
	
	private Boolean objBol = false;
	
	private Double price = 158.67;
	
	private Double bonus = 5.0;
	
	
	
	
	@Override
	public String toString() {
		return "SimpleClass [i=" + i + ", str=" + str + ", myChar=" + myChar + ", myAge=" + myAge + ", rate=" + rate
				+ ", myStudent=" + myStudent + ", isHappy=" + isHappy + ", objInt=" + objInt + ", objBol=" + objBol
				+ ", price=" + price + ", bonus=" + bonus + "]";
	}




	public static void main(String args[]) {
		
		SimpleClass sc = new SimpleClass();
		
		System.out.println("sc =  "+ sc);

		
		SimpleClass tamilSC = new SimpleClass();

		
		System.out.println("tamilSC =  "+ tamilSC);
		tamilSC.i = 99;
		tamilSC.isHappy = false;
		
		System.out.println("tamilSC =  "+ tamilSC);
		
		System.out.println("sc =  "+ sc);

		
		
		
	}



}
