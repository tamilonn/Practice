package code.test.viji;

public class OOPSClass {

	public OOPSClass() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String args[]) {
    	
    	Male vijiFather = new Male(2,2,"nose",2,2,"E.Dhanasekaran",60);
    	Female vijiMother = new Female(2,2,"White nose",2,2,"D.Kanimozhi",50);
    	Son vijiBrother = new Son(2,2,"Brown nose",2,2,"D.Mohan",24);
    	Daughter viji = new Daughter("D.Vijayalakshmi");
    	viji.setAge(23);
    	viji.setbindi("Green");
    	viji.setEars(2);
    	viji.setEyes(2);
    	viji.setHands(2);
    	viji.setLegs(2);
    	viji.setNose("kili nose");
    	
    	
    	System.out.println("vijiFather info.....");
    	System.out.println(vijiFather);
    	
    	System.out.println("vijiMother info.....");
    	System.out.println(vijiMother);
    	
    	System.out.println("viji info.....");
    	System.out.println(viji);
    	
    	viji.see();
    	viji.listen();
    	
    	viji.perform();
    }
}
