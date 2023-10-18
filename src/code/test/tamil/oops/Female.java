package code.test.tamil.oops;

public class Female extends Human {
	
	private String bindiColor = "RED";

	public Female() {
		// TODO Auto-generated constructor stub
	}

	public Female(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	

	public Female(int i, int j, String string, int k, int l, String string2, int m) {
		super(i,j,string,k,l,string2,m);
	}

	public String getBindiColor() {
		return bindiColor;
	}

	public void setBindiColor(String bindiColor) {
		this.bindiColor = bindiColor;
	}

	@Override
	public String toString() {
		return "Female [bindiColor=" + bindiColor + ", toString()=" + super.toString() + "]";
	}




	

}
