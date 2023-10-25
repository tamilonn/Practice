package code.test.tamil.collections;

public class TestShapeExample {

	public static void main(String[] args) {

		Circle circleObj = new Circle();
		circleObj.rotate();
		System.out.println(circleObj.info());
		
		//square
		Square squareObj = new Square();
		squareObj.rotate();
		System.out.println(squareObj.info());
		
		Shape shape = new Circle();
		shape.rotate();
		System.out.println(shape.info());
		
		shape = new Square();
		shape.rotate();
		System.out.println(shape.info());
		
		Shape polymorpism;
		
		polymorpism = circleObj;
		polymorpism.rotate();
		System.out.println("polymorpism in action is "+ polymorpism.info());
		
		polymorpism = squareObj;
		polymorpism.rotate();
		System.out.println("polymorpism in action is "+ polymorpism.info());
		
	}

}
