package code.test.tamil.classDataType;

import java.util.Arrays;

public class ShoppingCart {
	
	private int cartNo = 0;
	private String cartName = "";
	private int[] skuNumbers = null;

	
	
	public int getCartNo() {
		return cartNo;
	}
	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}
	public int[] getSkuNumbers() {
		return skuNumbers;
	}
	public void setSkuNumbers(int[] skuNumbers) {
		this.skuNumbers = skuNumbers;
	}
	
	
	
	public String getCartName() {
		return cartName;
	}
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
	@Override
	public String toString() {
		return "ShoppingCart [cartNo=" + cartNo + ", skuNumbers=" + Arrays.toString(skuNumbers) + ", cartName="
				+ cartName + "]";
	}
	
	

}
