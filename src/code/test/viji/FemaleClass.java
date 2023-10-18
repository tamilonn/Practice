package code.test.viji;

public class FemaleClass extends HumanClass {
	private String Bindi = "Red";

	public FemaleClass() {
		// TODO Auto-generated constructor stub
	}

	public FemaleClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public FemaleClass(int eyes, int ears, String nose, int hands, int legs, String name, int age) {
		super(eyes, ears, nose, hands, legs, name, age);
		// TODO Auto-generated constructor stub
	}
	public String getBindi() {
		return Bindi;
	}
	public void  setBindi(String Bindi) {
		this.Bindi = Bindi; 
	}

	@Override
	public String toString() {
		return "FemaleClass [Bindi=" + Bindi + ", getBindi()=" + getBindi() + ", see()=" + see() + ", listen()="
				+ listen() + ", smell()=" + smell() + ", take()=" + take() + ", toString()=" + super.toString()
				+ ", getEyes()=" + getEyes() + ", getEars()=" + getEars() + ", getNose()=" + getNose() + ", getHands()="
				+ getHands() + ", getLegs()=" + getLegs() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
