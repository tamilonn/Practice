package code.test.viji.oops.car;

public class Toyota extends Car {
	
	private String country = "Japan";

	public Toyota() {
		
	}

	public Toyota(String name, int no) {
		super(name, no);
		
	}

	@Override
	public String toString() {
		return "Toyota [toString()=" + super.toString() + "]";
	}

	

	
	

}
