package code.test.viji;

public class Carjava {
	String color,brand;
	static String blue;
	
	public Carjava() {
		this.color = "White";
		this.brand = "Maruti";
	}
	public Carjava(String a) {
	   this.color = a;
	   this.brand = "Maruti";
	}
	  public Carjava(String a,String anybrand) {
		  this.color = a;
		  this.brand = anybrand;
	  }
	  public static void main(String agrs[]) {
		 Carjava obj1 = new Carjava();
		 Carjava obj2 = new Carjava("Red");
		Carjava obj3 = new Carjava("Orange","Toyoya");
		
		System.out.println("Carjava obj1 is"+ obj1);
		System.out.println("Carjava obj2 is"+ obj2);
		System.out.println("Carjava obj3 is"+ obj3);
		 
	  }
	@Override
	public String toString() {
		return "Carjava [color=" + color + ", brand=" + brand + "]";
	}
	

}
