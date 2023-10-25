package code.test.tamil.collections;

public class Square implements Shape {
	
	private String color = "";

	@Override
	public void rotate() {
		System.out.println("Square is rotated");
	}

	@Override
	public String info() {
		this.color = Shape.COLOR_BLUE;
		return "My shape is Square and color is "+ color;
	}

}
