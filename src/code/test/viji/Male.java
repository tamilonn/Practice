package code.test.viji;

public class Male extends Human {
	private boolean hasBeard = false;
	public Male() {
		
	}
public Male(String name) {
	super(name);
}
public Male(int i,int j,String s,int l,int s2,String s3,int c) {
	super(i,j,s,l,s2,s3,c);
}
public boolean ishasbeard() {
	return hasBeard;
}
public void sethasBeard(boolean hasBeard) {
	this.hasBeard = hasBeard;
}
@Override
public String toString() {
	return "Male [hasBeard=" + hasBeard + "]";
}




}
