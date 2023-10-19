package code.test.tamil.classDataType;

public class AmazonProduct {
	
	private int skuNo;
	
	private String brandName;
	
	private String modelName;
	
	private int size;
	
	private Double price;
	
	private double discount;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	

	public int getSkuNo() {
		return skuNo;
	}

	public void setSkuNo(int skuNo) {
		this.skuNo = skuNo;
	}

	@Override
	public String toString() {
		return "AmazonProduct [skuNo=" + skuNo + ", brandName=" + brandName + ", modelName=" + modelName + ", size="
				+ size + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
	
	

}
