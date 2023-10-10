package code.test.tamil.oops;

public class TestOOPS {

	public static void main(String[] args) {
		
		//Creating Tamilselvan family

		///int eyes, int ears, String nose, int hands, int legs, String name, int age
		
		/* creating Parents */
		Male tamilselvanFather = new Male(2, 2, "Brown Nose", 2, 2, "A.Radhakrishan", 80);
		Female tamilselvanMother = new Female(2, 2, "White Nose", 2, 2, "R.Jaya", 66);
	
		
		/* creating tamilselvan myself */
		Son tamilselvan = new Son(2, 2, "Sharp Nose", 2, 2, "R.Tamilselvan", 48);
		tamilselvan.setHasMustache(true);
		
		/* creating padmini  */
		Female padmini = new Female(2, 2, "Kili Nose", 2, 2, "T.Padmini", 42);
		padmini.setBindiColor("Yello");
		
		// creating tarun
		Son tarun = new Son(2, 2, "Red Nose", 2, 2, "T.Tarun Karthik", 18);
		
		//creating navya
		Daughter navya = new Daughter("T.Navya");
		navya.setAge(8);
		navya.setBindiColor("PINK");
		navya.setEars(2);
		navya.setEyes(2);
		navya.setHands(2);
		navya.setLegs(2);
		navya.setNose("Curvy Nose");
		
		
		//Print all persons
		System.out.println("tamilselvanFather info.....");
		System.out.println(tamilselvanFather);
		
		
		System.out.println("tamilselvanMother info.....");
		System.out.println(tamilselvanMother);
		
		System.out.println("tamilselvan info......");
		System.out.println(tamilselvan);
		
		//Abstraction
		tamilselvan.see();
		tamilselvan.listen();
		
		
		//Encapsulation
		tamilselvan.perform();

	}

}
