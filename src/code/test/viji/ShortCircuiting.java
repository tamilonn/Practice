package code.test.viji;

public class ShortCircuiting {
	public static void main(String agrs[]) {
		int a = 20,b = 15,c = 5;
		System.out.println("value of b : "+b);
		if((a>b)&& (++b>c)) {
			System.out.println("Inside if block");
		System.out.println("Value of b : "+ b);
		}
	}

}
