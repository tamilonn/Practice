package code.test.viji.oops;

public class OOPScar {

	public static void main(String args[]) {
	
		Honda hondacity = new HondaCity("Honda City",2764);
		System.out.println("hondacity info.....");
		System.out.println(hondacity);
		
		Honda hondaamaze = new HondaAmaze("Honda Amaze",7945);
		hondaamaze.setHasJapan(true);
		System.out.println("hondaamaze info.....");
		System.out.println(hondaamaze);
		
		Toyota toyotaEtios = new ToyotaEtios("Toyota Etios",8215);
		System.out.println("ToyotaEtios info....");
		System.out.println(toyotaEtios);
		
		Toyota toyotainnova = new ToyotaInnova("Toyota Innova");
		toyotainnova.setCarNo(9876);
		System.out.println("toyotainnova info....");
		System.out.println(toyotainnova);

		

		

		//Abstract call to Car's method
		hondacity.brake();
		hondacity.horn();
		hondacity.speed();
		
		//Encapsulation
		hondacity.testDrive();
		
	}

}
