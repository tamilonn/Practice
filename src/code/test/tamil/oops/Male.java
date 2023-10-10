package code.test.tamil.oops;

public class Male extends Human {
	
	private boolean hasMustache = false;

	public Male() {
		// TODO Auto-generated constructor stub
	}

	public Male(String name) {
		super(name);
		
	}

	public Male(int i, int j, String string, int k, int l, String string2, int m) {
		super(i,j,string,k,l,string2,m);
	}

	public boolean isHasMustache() {
		return hasMustache;
	}

	public void setHasMustache(boolean hasMustache) {
		this.hasMustache = hasMustache;
	}

	@Override
	public String toString() {
		return "Male [hasMustache=" + hasMustache + ", toString()=" + super.toString() + "]";
	}


	


	
	

}
