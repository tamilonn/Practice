package code.test.viji;

public class OOPS {

	public OOPS() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String agrs[]) {
		
	}
	Male VijiFather = new Male(2,2,"nose",2,2,"E.Dhanasekaran",60);
	Female VijiMother = new Female(2,2,"White nose",2,2,"D.Kanimozhi",50);
	Son vijibrother = new Son(2,2,"brown nose",2,2,"D.Mohan",24);
	Daughter Viji = new Daughter(2,2,"Sharp nose",2,2,"D.Vijayalakshmi",23);
	
System.out.println("VijiFather info........");
System.out.println(VijiFather);
System.out.println("VijiMother info........");
System.out.println(VijiMother);
System.out.println("Vijibrother info........");
System.out.println(Vijibrother);
System.out.println("Viji info..........");
System.out.println(Viji);

Viji.see();
Viji.listen();

Viji.perform();



}
