package code.test.viji.oops.car;

public class Honda extends Car {
	
	private boolean hasJapan = false;

	public Honda() {
		
	}

	public Honda(String name, int no) {
		super(name, no);
		
	}
	
	public boolean ishasJapan() {
		return hasJapan;
	}
	public void sethasJapan(boolean Japan) {
		this.hasJapan = hasJapan;
	}
	

	@Override
	public String toString() {
		return "Honda [toString()=" + super.toString() + "]";
	}

}
