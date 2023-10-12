package code.test.viji;

public class Son extends Father {

	public Son() {
		// TODO Auto-generated constructor stub
	}

	public Son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Son(int i, int j, String s, int l, int s2, String s3, int c) {
		super(i, j, s, l, s2, s3, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Son [toString()=" + super.toString() + ", ishasbeard()=" + ishasbeard() + ", see()=" + see()
				+ ", listen()=" + listen() + ", smell()=" + smell() + ", take()=" + take() + ", drop()=" + drop()
				+ ", getEyes()=" + getEyes() + ", getEars()=" + getEars() + ", getNose()=" + getNose() + ", getHands()="
				+ getHands() + ", getLegs()=" + getLegs() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
