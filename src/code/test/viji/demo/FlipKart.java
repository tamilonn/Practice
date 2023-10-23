package code.test.viji.demo;

public class FlipKart {
	
	private String brandNmae = "";
	private String moldeName = "";
	private int size = 0;
	private double  price = 0;
	private int SkulNo = 0;
	
	
	
	public String getBrandNmae() {
		return brandNmae;
	}
	
	public void setBrandNmae(String brandNmae) {
		this.brandNmae = brandNmae;
	}
	
	public String getMoldeName() {
		return moldeName;
	}
	
	public void setMoldeName(String moldeName) {
		this.moldeName = moldeName;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public int getSkulNo() {
		return SkulNo;
	}

	public void setSkulNo(int SkulNo) {
		this.SkulNo = SkulNo;
	}

	@Override
	public String toString() {
		return "FlipKart [brandNmae=" + brandNmae + ", moldeName=" + moldeName + ", size=" + size + ", price=" + price
				+ ", SkulNo=" + SkulNo + "]";
	}

	
	}
	
		 
		 
		 
	


