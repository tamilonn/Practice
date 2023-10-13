package code.test.viji.oops;

public class HondaCity extends Honda {

	public HondaCity() {
	}

	public HondaCity(String name) {
		super(name);
	}

	public HondaCity(String name, int no) {
		super(name, no);
	}

	@Override
	public String toString() {
		return "HondaCity [toString()=" + super.toString() + "]";
	}



}
