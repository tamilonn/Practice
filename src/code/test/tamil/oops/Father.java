package code.test.tamil.oops;

public class Father extends Male {

	public Father() {
		// TODO Auto-generated constructor stub
	}

	public Father(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	

	public Father(int i, int j, String string, int k, int l, String string2, int m) {
		super(i, j, string, k, l, string2, m);
	}

	@Override
	public String toString() {
		return "Father [isHasMustache()=" + isHasMustache() + ", toString()=" + super.toString() + "]";
	}





}
