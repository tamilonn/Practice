package code.test.viji;

public class Female extends Human {
	
	public String bindi = "Red";
	
	public Female() {
	}	
	public Female (String name) {
		super(name);
	}
public Female(int i,int j,String s,int l,int s2,String s3,int c) {
	super (i,j,s,l,s2,s3,c);
	}
public String getbindi() {
	return bindi;
}	
public void setbindi(String bindi) {
	this.bindi = bindi;
}
@Override
public String toString() {
	return "Female [bindi=" + bindi + "]";
}


	


}
