package code.test.viji;

public class Shape {
	String type ;
	int size;
	String color;
    
	
	
	
	public  Shape() {
	this.type = "circle";
	this.size = 100; 
    this.color = "purple";
	
	}
	public Shape(String anytype) {
		this.type = anytype;
		this.size = 100;
		this.color = "purple";
		
		
	}
	public Shape(String anytype,int anysize) {
		this.type = anytype;
		this.size = anysize;
		this.color = "purple";
		
	}
	public Shape(String anytype,int anysize,String anycolor) {
	    this.type = anytype;
	    this.size = anysize;
	    this.color = anycolor;
	    
	}
	public static void main(String agrs[]) {
		Shape obj1 = new Shape();
		Shape rectangle = new Shape("rectangle");
		Shape obj2 = new Shape("triangle" ,200);
		Shape obj3 = new Shape("square",300,"blue");
		Shape obj4 = new Shape("rectangle",400,"red");
		System.out.println("Shape obj1 "+obj1);
		System.out.println("Shape obj2 "+obj2);
		System.out.println("Shape obj3 "+obj3);
		System.out.println("Shape obj4 "+obj4);
	    System.out.println("Shape rectangle "+rectangle);
	
	
		
		
	}
	@Override
	public String toString() {
		return "Shape [type=" + type + ", size=" + size + ", color=" + color + "]";
	}
	
	
	
	
	
	
	}
	
	


