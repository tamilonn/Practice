package code.test.tamil.collections;

public class Circle implements Shape {
	
	private String color = "";

	@Override
	public void rotate() {
		System.out.println("Circle is rotated");
	}

	@Override
	public String info() {
		this.color = Shape.COLOR_ORANGE;
		
		return "My shape is circle and color is "+ color;
	}

}
