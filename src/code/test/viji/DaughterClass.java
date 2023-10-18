package code.test.viji;

public class DaughterClass extends MotherClass {

	public DaughterClass() {
		// TODO Auto-generated constructor stub
	}

	public DaughterClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public DaughterClass(int eyes, int ears, String nose, int hands, int legs, String name, int age) {
		super(eyes, ears, nose, hands, legs, name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DaughterClass [toString()=" + super.toString() + ", getBindi()=" + getBindi() + ", see()=" + see()
				+ ", listen()=" + listen() + ", smell()=" + smell() + ", take()=" + take() + ", getEyes()=" + getEyes()
				+ ", getEars()=" + getEars() + ", getNose()=" + getNose() + ", getHands()=" + getHands()
				+ ", getLegs()=" + getLegs() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
