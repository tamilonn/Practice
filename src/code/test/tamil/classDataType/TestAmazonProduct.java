package code.test.tamil.classDataType;

import java.util.HashMap;
import java.util.Map;

public class TestAmazonProduct {
	
	

	public static void main(String[] args) {
		
		AmazonProduct amazonProduct = new AmazonProduct();
		
		//create map collections.
		Map productMap = new HashMap();
		
		System.out.println("amazonProduct = "+ amazonProduct);
		
		//TV
		AmazonProduct samsungTV = new AmazonProduct();
		samsungTV.setSkuNo(10001);
		samsungTV.setBrandName("Samsung");
		samsungTV.setDiscount(1);
		samsungTV.setModelName("Samsung QN50Q60C");
		samsungTV.setPrice(50000.0);
		samsungTV.setSize(50);
		
		productMap.put(10001, samsungTV);
		
		System.out.println("samsungTV = "+ samsungTV);
		
		AmazonProduct samsungTV2 = new AmazonProduct();
		samsungTV2.setSkuNo(10002);
		samsungTV2.setBrandName("Samsung");
		samsungTV2.setDiscount(0);
		samsungTV2.setModelName("Samsung QN75Q60C");
		samsungTV2.setPrice(200000.0);
		samsungTV2.setSize(75);
		
		productMap.put(10002, samsungTV2);
	
		
		System.out.println("samsungTV2 = "+ samsungTV2);
		
		//Mobile Phones
		AmazonProduct iphone14 = new AmazonProduct();
		iphone14.setSkuNo(50005);
		iphone14.setBrandName("Apple");
		iphone14.setDiscount(0);
		iphone14.setModelName("Pro 14 model");
		iphone14.setPrice(135000.99);
		iphone14.setSize(256);
		
		productMap.put(50005, iphone14);
		
		System.out.println("iPhone 14 = "+ iphone14);
		
		
		//Blutooth
		AmazonProduct jabbarBT = new AmazonProduct();
		jabbarBT.setSkuNo(70008);
		jabbarBT.setBrandName("Jabbar");
		jabbarBT.setDiscount(5);
		jabbarBT.setModelName("Jabbar Bluetooth Model 1");
		jabbarBT.setPrice(2400.00);
		jabbarBT.setSize(1);
		
		productMap.put(70008, jabbarBT);
		
		System.out.println("Product hashmap contains : " + productMap);
		
		//Tamil's shopping items or cart
		int[] tamilSkuNumbers = new int[2];
		ShoppingCart tamilCart = new ShoppingCart();
		tamilCart.setCartName("Tamilselvan's Shopping cart");
		tamilCart.setCartNo(100);
		
		//add item to cart
		tamilSkuNumbers[0] = 50005;
		tamilSkuNumbers[1] = 70008;
		//add array to tamilCart
		tamilCart.setSkuNumbers(tamilSkuNumbers);
		
		System.out.println("Tamil shopping cart contains: " + tamilCart);
		
		
		//Viji's shopping cart
		int[] vijiSkuNumbers = new int[1];
		ShoppingCart vijiCart = new ShoppingCart();
		vijiCart.setCartName("Vijayalakshmi's Shopping cart");
		vijiCart.setCartNo(2002);
		
		//add item to cart
		vijiSkuNumbers[0] = 10002;
		//add array to tamilCart
		vijiCart.setSkuNumbers(vijiSkuNumbers);
		

		System.out.println("------------------------------------------");
		//view viji's cart items
		for( int i=0; i<vijiCart.getSkuNumbers().length; i++) {
			int skuNo = vijiCart.getSkuNumbers()[i];
			System.out.println("Viji shopping cart products: " + productMap.get(skuNo));
		}
		
		System.out.println("------------------------------------------");
		
		//view Tamil's cart items
		for( int i=0; i<tamilCart.getSkuNumbers().length; i++) {
			int skuNo = tamilCart.getSkuNumbers()[i];
			System.out.println("Tamilselvan's shopping cart products: " + productMap.get(skuNo));
		}
		
		

	}

}
