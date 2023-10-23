package code.test.viji.demo;

import java.util.HashMap;
import java.util.Map;

import code.test.tamil.classDataType.ShoppingCart;

public class FlipKartPurchase {

	

	public static void main(String agrs[]) {
		
		FlipKart purchase = new FlipKart();
		
		Map FlipMap = new HashMap();
		
		System.out.println("FlipKart = "+purchase);
		
		 System.out.println(".......................................");
		 
		 
	        
		FlipKart sonyTV = new FlipKart();
		sonyTV.setBrandNmae("SONY");
		sonyTV.setMoldeName("SmartTV");
		sonyTV.setPrice(45000);
		sonyTV.setSize(42);
		sonyTV.setSkulNo(9009);
        System.out.println("sonyTV = "+sonyTV);
        
        FlipMap.put(9009,sonyTV);
        
        System.out.println(".......................................");
        
        
        FlipKart LGTV = new FlipKart();
        LGTV.setBrandNmae("LG");
        LGTV.setMoldeName("AndroidTV");
        LGTV.setPrice(50000);
        LGTV.setSize(55);
        LGTV.setSkulNo(8067);
        System.out.println("LGTV = "+LGTV);
        
        FlipMap.put(8067, LGTV);
        
        System.out.println(".......................................");
        
		
        FlipKart Mi = new FlipKart();
        Mi.setBrandNmae("MI");
        Mi.setMoldeName("Note 7pro");
        Mi.setPrice(15000);
        Mi.setSize(10);
        Mi.setSkulNo(5050);
        System.out.println("Mi = "+Mi);
        
        FlipMap.put(5050, Mi);
        
        
        System.out.println(".......................................");
        
        
        FlipKart oppo = new FlipKart();
        oppo.setBrandNmae("oppo");
        oppo.setMoldeName("Reno 10 5G");
        oppo.setPrice(25000);
        oppo.setSize(11);
        oppo.setSkulNo(4004);
        System.out.println("oppo = "+oppo);
        
        FlipMap.put(4004, oppo);
        
        System.out.println("FlipKart HashMap: "+FlipMap);
        
        int[] KaniSkulNo = new int[3];
        FlipKartShoppingCart KaniCart = new FlipKartShoppingCart();
        KaniCart.setcartName("Kani's Shopping Cart");
        KaniCart.setCartNo(404);
        
       KaniSkulNo[0]= 8067;
       KaniSkulNo[1]= 5050;
       KaniSkulNo[2]= 4004;
       
       KaniCart.setSkulNo(KaniSkulNo);
       System.out.println("Kani's Shopping Cart "+KaniCart);
       
       
       int[] MohanSkulNo = new int[2];
       FlipKartShoppingCart MohanCart = new FlipKartShoppingCart();
       MohanCart.setcartName("Mohan's Shopping Cart");
       MohanCart.setCartNo(404);
       
       MohanSkulNo[0]= 8067;
       MohanSkulNo[1]= 5050;
       
      
       MohanCart.setSkulNo(MohanSkulNo);
      System.out.println("Mohan's Shopping Cart "+MohanCart);
      
      
      for( int i=0; i<KaniCart.getSkulNo().length; i++) {
			int skulNo = KaniCart.getSkulNo()[i];
			System.out.println("Kani shopping cart products: " + FlipMap.get(skulNo));
		}
		
      for(int i=0;i<MohanCart.getSkulNo().length;i++) {
    	  int skulNo = MohanCart.getSkulNo()[i];
    	  System.out.println("Mohan Shopping cart products: "+FlipMap.get(skulNo));
      }
	}
	

}
