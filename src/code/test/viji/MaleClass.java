package code.test.viji;

public class MaleClass extends HumanClass {
	
	private boolean hasBeard = false;

	public MaleClass() {
		// TODO Auto-generated constructor stub
	}

	public MaleClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public MaleClass(int eyes, int ears, String nose, int hands, int legs, String name, int age) {
		super(eyes, ears, nose, hands, legs, name, age);
		// TODO Auto-generated constructor stub
	}
	
	public boolean ishasBeard() {
		return hasBeard;
	}
    public void sethasBeard(boolean hasBeard) {
	    this.hasBeard = hasBeard;
}

	@Override
	public String toString() {
		return "MaleClass [hasBeard=" + hasBeard + ", ishasBeard()=" + ishasBeard() + ", see()=" + see() + ", listen()="
				+ listen() + ", smell()=" + smell() + ", take()=" + take() + ", toString()=" + super.toString()
				+ ", getEyes()=" + getEyes() + ", getEars()=" + getEars() + ", getNose()=" + getNose() + ", getHands()="
				+ getHands() + ", getLegs()=" + getLegs() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
    
	
}
