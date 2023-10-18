package code.test.viji;

public class Money {
	
   public static void main(String agrs[]) {
	   
	   int ushaAmount = 35;
	   int kannanAmount = 25;
	   int deduct = 20;
	   
	   print(ushaAmount, kannanAmount);
	   
	   System.out.println("Now deducting 20 from Usha......");
	   
	   ushaAmount -= deduct;// ushaAmount = ushaAmount - 20;
	   
	   print(ushaAmount, kannanAmount);
	   
	   
	   
//		System.out.println("usha "+usha);
   }
   
   private static void print(int ushaAmount, int kannanAmount) {
	   if (ushaAmount > kannanAmount ) {
		   System.out.println("Usha has more money than Kannan");
	   } else {
		   System.out.println("Kannan has more money than Usha");
	   }
	   
	   System.out.println("Congratulations. Job done");
   }
  
	
	

	




}


