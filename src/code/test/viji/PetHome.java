package code.test.viji;

public class PetHome {
	
		String pet;
		int age;
		String color;
		
		public PetHome() {
			this.pet ="dog";
			this.age =3;
			this.color ="golden";
		}
	   public PetHome(String anypet){
		   this.pet = anypet;
		   this.age = 3;
		   this.color ="golden";
	   }
	   public PetHome(String anypet,int anyage) {
		   this.pet = anypet;
		   this.age = anyage;
		   this.color = "golden";
		   
	   }
		public PetHome(String anypet,int anyage,String anycolor) {
			this.pet = anypet;
			this.age = anyage;
			this.color = anycolor;
		}
		public static void main(String agrs[]) {
			PetHome obj1 = new PetHome();
			PetHome obj2 = new PetHome("cat");
			PetHome obj3 = new PetHome("fish",4);
			PetHome obj4 = new PetHome("bird",5,"green");
			System.out.println("PetHome obj1 "+obj1);
			System.out.println("PetHome obj2 "+obj2);
			System.out.println("PetHome obj3 "+obj3);
			System.out.println("PetHome obj4 "+obj4);
			
		}
		@Override
		public String toString() {
			return "PetHome [pet=" + pet + ", age=" + age + ", color=" + color + "]";
		}
}
		