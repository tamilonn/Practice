package code.test.viji.demo;

import java.util.Arrays;

public class FlipKartShoppingCart {

	private int cartNo = 0;
	private String cartName = "";
	private int[] SkulNo = null;
	
	
	public int getCartNo() {
		return cartNo;
	}
	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}
	public String getCartName() {
		return cartName;
	}
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
	public int[] getSkulNo() {
		return SkulNo;
	}
	public void setSkulNo(int[] KaniSkulNo) {
		this.SkulNo = KaniSkulNo;
	}
	
	
	public String getcartName() {
		return cartName;
	}
	public void setcartName(String Name) {
		this.cartName = Name;
	}
	@Override
	public String toString() {
		return "FlipKartShoppingCart [cartNo=" + cartNo + ", cartName=" + cartName + ", SkulNo="
				+ Arrays.toString(SkulNo) + "]";
	}
	
		
	
	
		
	
	

	
	
	
		
	

}
