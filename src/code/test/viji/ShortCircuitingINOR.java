package code.test.viji;

public class ShortCircuitingINOR {
	public static void main(String agrs[]) {
	int a = 20,b = 10,c = 15;
	System.out.println("Value of b: "+ b);
	if ((a<c)||(++b<c))
		System.out.println("Inside if");
	System.out.println("Value of b: "+b);
	
	}
}