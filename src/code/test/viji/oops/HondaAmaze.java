package code.test.viji.oops;

public class HondaAmaze extends Honda {

	public HondaAmaze() {
	}

	public HondaAmaze(String name) {
		super(name);
	}

	public HondaAmaze(String name, int no) {
		super(name, no);
	}

	@Override
	public String toString() {
		return "HondaAmaze [toString()=" + super.toString() + "]";
	}


	
}
