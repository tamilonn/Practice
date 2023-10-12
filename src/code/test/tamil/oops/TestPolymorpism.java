package code.test.tamil.oops;

public class TestPolymorpism {

	public static void main(String[] args) {

		
		Male tamilselvan = new Male(2, 2, "Sharp Nose", 2, 2, "R.Tamilselvan", 48);
		Female viji = new Female(2, 2, "Red Nose", 2, 2, "Vijaylakshmi", 23);
		
		System.out.println("Male object contains..." + tamilselvan);
		System.out.println("Female object contains..." + viji);
		
		Male v1 = tamilselvan;
		System.out.println("Male v1 object contains... " + v1);
		
		Female v2 = viji;
		System.out.println("Female v2 object contains..." + viji);
		
		
		//Magic here
		Human h1 = v2;
		System.out.println("Human h1 object contains..." + h1);
		
		Human h2 = v1;
		System.out.println("Human h2 object contains..." + h2);
		
		//Son
		Son tarun = new Son(2, 2, "Red Nose", 2, 2, "T.Tarun Karthik", 18);
		System.out.println("Son tarun object contains..." + tarun);
		
		//Magic
		Human h3 = tarun;
		System.out.println("Human h3 object contains..." + h3);
	}

}
