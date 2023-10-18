package code.test.viji;

public class DoubleWarpper {
	
	public static void main(String agrs[]) {
		
	Double d1 = 38.98; 
	Double d2 = 49.67;
	Double d3 = 38.98;
	System.out.println("compare d1 and d3 is "+Double.compare(d1, d3));
	System.out.println("doubleValue is "+d1.doubleValue());	
	System.out.println("equals using d1 and d2 is "+d1.equals(d2));
	System.out.println("equals using d1 and d3 is "+d1.equals(d3));
	System.out.println("longValue using d1  is "+d1.longValue());	
	System.out.println("sum using d1 and d2 is "+Double.sum(d1,d2));
	System.out.println("sum using d1 and d2 is "+d1.sum(d1,d2));
		
	}

}
