package code.test.viji.oops;

public abstract class Honda extends Car {

	private boolean hasJapan = false;

	public Honda() {
	}

	public Honda(String name) {
		super(name);
	}

	public Honda(String name, int no) {
		super(name, no);
	}

	public boolean isHasJapan() {
		return hasJapan;
	}

	public void setHasJapan(boolean hasJapan) {
		this.hasJapan = hasJapan;
	}

	@Override
	public String toString() {
		return "Honda [hasJapan=" + hasJapan + ", toString()=" + super.toString() + "]";
	}
	
	



}
