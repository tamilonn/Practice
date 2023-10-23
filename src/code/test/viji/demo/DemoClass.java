package code.test.viji.demo;

public class DemoClass {
	
	private String Name = "Demo";
	private int age = 4;
	private double hight = 0;
    private char mychar ='@';
    private int Phno = 4 ;
    private Double objint = 1023.87;
    private Integer Rollno = 22;
    private boolean isPresent = true;
	@Override
	public String toString() {
		return "DemoClass [Name=" + Name + ", age=" + age + ", hight=" + hight + ", mychar=" + mychar + ", Phno=" + Phno
				+ ", objint=" + objint + ", Rollno=" + Rollno + ", isPresent=" + isPresent + "]";
	}
      public static void main(String args[]) {
    	
    	DemoClass dc = new DemoClass();
    	System.out.println("DemoClass = "+dc);
    	
    	DemoClass Viji = new DemoClass();
        Viji.age = 23;
        Viji.hight = 5.5;
        Viji.Name = "Viji";
        Viji.mychar = '$';
        Viji.Phno = 8;
        Viji.Rollno = 22;
        Viji.isPresent = true;
        Viji.objint = 987.983;
       System.out.println("Viji = "+Viji);
       
       
       DemoClass Preethi = new DemoClass();
       Preethi.age = 25;
       Preethi.hight = 6.0;
       Preethi.Name = "Preethi";
       Preethi.mychar = '@';
       Preethi.Phno = 0;
       Preethi.Rollno = 25;
       Preethi.isPresent = true;
       Preethi.objint = 784.562;
      System.out.println("Preethi = "+Preethi);
      
 
      DemoClass Ram = new DemoClass();
      Ram.age = 23;
      Ram.hight = 6.0;
      Ram.Name = "Ram";
      Ram.mychar = '&';
      Ram.Phno = 7;
      Ram.Rollno = 24;
      Ram.isPresent = true;
      Ram.objint = 784.562;
     System.out.println("Ram = "+Ram);
        
    }
    
    
    
}
