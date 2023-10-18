package code.test.tamil.classDataType;

public class TestAmazonProduct {
	
	

	public static void main(String[] args) {
		
		AmazonProduct amazonProduct = new AmazonProduct();
		
		System.out.println("amazonProduct = "+ amazonProduct);
		
		//TV
		AmazonProduct samsungTV = new AmazonProduct();
		samsungTV.setBrandName("Samsung");
		samsungTV.setDiscount(1);
		samsungTV.setModelName("Samsung QN50Q60C");
		samsungTV.setPrice(50000.0);
		samsungTV.setSize(50);
		
		System.out.println("samsungTV = "+ samsungTV);
		
		AmazonProduct samsungTV2 = new AmazonProduct();
		samsungTV2.setBrandName("Samsung");
		samsungTV2.setDiscount(0);
		samsungTV2.setModelName("Samsung QN75Q60C");
		samsungTV2.setPrice(200000.0);
		samsungTV2.setSize(75);
	
		
		System.out.println("samsungTV2 = "+ samsungTV2);
		
		//Mobile Phones
		AmazonProduct iphone14 = new AmazonProduct();
		iphone14.setBrandName("Apple");
		iphone14.setDiscount(0);
		iphone14.setModelName("Pro 14 model");
		iphone14.setPrice(135000.99);
		iphone14.setSize(6);
		
		System.out.println("iPhone 14 = "+ iphone14);
		
		

	}

}
