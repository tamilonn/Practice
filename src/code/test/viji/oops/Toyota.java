package code.test.viji.oops;

public abstract class Toyota extends Car {
	
	private String country = "Japan";

	public Toyota() {
		// TODO Auto-generated constructor stub
	}

	public Toyota(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Toyota(String name, int no) {
		super(name, no);
		// TODO Auto-generated constructor stub
	}
	
	public String getCountry() {
		return country;
	}
   public void setCountry(String country) {
	   this.country = country;
   }

@Override
public String toString() {
	return "Toyota [country=" + country + ", toString()=" + super.toString() + "]";
}





	}  

