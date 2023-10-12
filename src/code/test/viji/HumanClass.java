package code.test.viji;

public abstract class HumanClass {
	
	private int eyes = 0;
	private int ears = 0;
	private String nose = "";
	private int hands = 0;
	private int legs = 0;
	private String name = "";
	private int age = 0;
	

	public HumanClass() {
		// TODO Auto-generated constructor stub
		
	}
	public HumanClass(String name) {
		this.name = name;
	}
	public HumanClass(int eyes,int ears,String nose,int hands,int legs,String name,int age) {
	    
		this.eyes = eyes;
	    this.ears = ears;
	    this.nose = nose;
	    this.hands = hands;
	    this.legs = legs;
	    this.name = name;
	    this.age = age;
	    
	}
	public String see() {
		System.out.println(name+"is seeing");
		return name+"is seeing";
	}
   public String listen() {
	   System.out.println(name+"is listening to song");
	   return name+"is listening to song";
   }
   public String smell() {
	   System.out.println(name+"smell using nose = "+nose);
	   return name+"smell using nose = "+nose;
   }
   public String take() {
	   System.out.println(name+"is taking chair ");
	   return name+"is taking chair";
	   }
   public void walk() {
	   System.out.println(name+"is walking");
	   
   }
@Override
public String toString() {
	return "HumanClass [eyes=" + eyes + ", ears=" + ears + ", nose=" + nose + ", hands=" + hands + ", legs=" + legs
			+ ", name=" + name + ", age=" + age + "]";
}
public int getEyes() {
	return eyes;
}
public void setEyes(int eyes) {
	this.eyes = eyes;
}
public int getEars() {
	return ears;
}
public void setEars(int ears) {
	this.ears = ears;
}
public String getNose() {
	return nose;
}
public void setNose(String nose) {
	this.nose = nose;
}
public int getHands() {
	return hands;
}
public void setHands(int hands) {
	this.hands = hands;
}
public int getLegs() {
	return legs;
}
public void setLegs(int legs) {
	this.legs = legs;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
   public void perform() {
	   StringBuffer sb = new StringBuffer().append("The greate things that")
			   .append(name)
			   .append("has are...")
			   .append("1.").append(see())
			   .append("2.").append(listen())
			   .append("3.").append(smell());
	   
	   System.out.println(sb.toString());
	   
   }
}
