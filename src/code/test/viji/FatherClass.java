package code.test.viji;

public class FatherClass extends MaleClass {

	public FatherClass() {
		// TODO Auto-generated constructor stub
	}

	public FatherClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public FatherClass(int eyes, int ears, String nose, int hands, int legs, String name, int age) {
		super(eyes, ears, nose, hands, legs, name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FatherClass [ishasBeard()=" + ishasBeard() + ", toString()=" + super.toString() + ", see()=" + see()
				+ ", listen()=" + listen() + ", smell()=" + smell() + ", take()=" + take() + ", getEyes()=" + getEyes()
				+ ", getEars()=" + getEars() + ", getNose()=" + getNose() + ", getHands()=" + getHands()
				+ ", getLegs()=" + getLegs() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
