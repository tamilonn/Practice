package code.test.tamil;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] intArray = {10,26,34,48,50};
		
		double[] dobArray = {1.2, 3.45, 6.9};
		
		char[] cArray = {'A', 'a', 'z', 'V'};
		
		
		System.out.println("Integer values in intArray are....");
		
		for(int i=0; i < intArray.length; i++) { // intArray length/size = 5 
			System.out.println("intArray["+ i + "] contains : " + intArray[i]); 
		}
		
		System.out.println("double values in dobArray are....");
		for(int i=0; i < dobArray.length; i++) { // dobArray length/size = 3 
			System.out.println("dobArray["+ i + "] contains : " + dobArray[i]); 
		}
		
		
		System.out.println("char values in cArray are....");
		for(int i=0; i < cArray.length; i++) { // cArray length/size = 4 
			System.out.println("cArray["+ i + "] contains : " + cArray[i]); 
		}
		
		
		System.out.println("---------------------------------------------------------------------- Next ---------------------");
		
		
		int[] aIntArray = new int[10];
		
		System.out.println("IntArray values in aIntArray are....");
		for(int i=0; i < aIntArray.length; i++) { // aIntArray length/size = 10 
			System.out.println("aIntArray["+ i + "] contains : " + aIntArray[i]); 
			aIntArray[i] = 100 +i;
		
		}
		
		System.out.println("IntArray values in aIntArray are....");
		for(int i=0; i < aIntArray.length; i++) { // aIntArray length/size = 10 
			System.out.println("aIntArray["+ i + "] contains : " + aIntArray[i]); 
			
		
		}
		System.out.println("---------------------------------------------------------------------- Next ---------------------");
		
		
		double[] aDobArray = new double[5];
		System.out.println("aDobArray values in aDobArray are....");
		for(int i=0; i < aDobArray.length; i++) { //  aDobArray/size = 5 
			System.out.println("aDobArray["+ i + "] contains : " + aDobArray[i]); 
			aDobArray[i] = 22.5 + i;
		
		}
		
		
		System.out.println("aDobArray values in aDobArray are....");
		for(int i=0; i < aDobArray.length; i++) { //  aDobArray/size = 5 
			System.out.println("aDobArray["+ i + "] contains : " + aDobArray[i]); 
			
		
		}
		
		System.out.println("---------------------------------------------------------------------- Next ---------------------");
		
		
		char[] aCharArray = new char[3];
		System.out.println("aCharArray values in aCharArray are....");
		for(int i=0; i < aCharArray.length; i++) { //  aCharArray/size = 3 
			System.out.println("aCharArray["+ i + "] contains : " + aCharArray[i]); 
			aCharArray[i] = 'A';
		
		}
		
		
		System.out.println("aCharArray values in aCharArray are....");
		for(int i=0; i < aCharArray.length; i++) { 
			System.out.println("aCharArray["+ i + "] contains : " + aCharArray[i]); 
			
			
		}

	}


	

}
