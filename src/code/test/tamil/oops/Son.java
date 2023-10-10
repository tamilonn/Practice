package code.test.tamil.oops;

public class Son extends Father {

	public Son() {
		// TODO Auto-generated constructor stub
	}

	public Son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Son(int i, int j, String string, int k, int l, String string2, int m) {
		super(i,j,string,k,l,string2,m);
	}

	@Override
	public String toString() {
		return "Son [toString()=" + super.toString() + ", isHasMustache()=" + isHasMustache() + "]";
	}





}
