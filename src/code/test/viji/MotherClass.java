package code.test.viji;

public class MotherClass extends FemaleClass {

	public MotherClass() {
		// TODO Auto-generated constructor stub
	}

	public MotherClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public MotherClass(int eyes, int ears, String nose, int hands, int legs, String name, int age) {
		super(eyes, ears, nose, hands, legs, name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotherClass [getBindi()=" + getBindi() + ", toString()=" + super.toString() + ", see()=" + see()
				+ ", listen()=" + listen() + ", smell()=" + smell() + ", take()=" + take() + ", getEyes()=" + getEyes()
				+ ", getEars()=" + getEars() + ", getNose()=" + getNose() + ", getHands()=" + getHands()
				+ ", getLegs()=" + getLegs() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
