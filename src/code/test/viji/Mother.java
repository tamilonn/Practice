package code.test.viji;

public class Mother extends Female {

	public Mother() {
		// TODO Auto-generated constructor stub
	}

	public Mother(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Mother(int i, int j, String s, int l, int s2, String s3, int c) {
		super(i, j, s, l, s2, s3, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mother [bindi=" + bindi + ", getbindi()=" + getbindi() + ", toString()=" + super.toString() + ", see()="
				+ see() + ", listen()=" + listen() + ", smell()=" + smell() + ", take()=" + take() + ", drop()="
				+ drop() + ", getEyes()=" + getEyes() + ", getEars()=" + getEars() + ", getNose()=" + getNose()
				+ ", getHands()=" + getHands() + ", getLegs()=" + getLegs() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
