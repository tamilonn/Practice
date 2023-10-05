package code.test.tamil;

public class LogicalOperatorExample {

	public static void main(String[] args) {

		//Logincal operators are AND (&&),   OR (||),   NOT (!)
		
		int a = 10, b = 10, c = 20, d =0;
		
		 System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        
        //AND test
        
        if (( a < b ) && (b == c)) {
        	System.out.println("AND operator returns true");
        } else {
        	System.out.println("AND operator returns false");
        }
        
        
        //OR test
        
        if ((a > b)  || (c < b)) {
        	System.out.println("OR operator returns true");
        } else {
        	System.out.println("OR operator returns false");
        }
        
        //NOT test
        
        if ( a != b) {
        	System.out.println("NOT operator returns true");
        } else {
        	System.out.println("NOT operator returns false");
        }
		
		
	}

}
