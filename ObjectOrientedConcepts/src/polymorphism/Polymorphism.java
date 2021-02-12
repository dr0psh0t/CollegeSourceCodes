package polymorphism;

public class Polymorphism 
{
	public static void main(String[] args) 
	{
		RectangleFigure rectangle, shapeRef;
		BoxFigure box;
		
		rectangle = new RectangleFigure(8, 5);
		box = new BoxFigure(10, 7, 3);
		
		shapeRef = rectangle; 
		//the reference variable shapeRef points to the instantiated object rectangle
		System.out.println("Line 15: Rectangle:\n"+shapeRef);
		System.out.println();
		
		shapeRef = box;
		//the object reference variable shapeRef of type RectangleFigure points to its
		//subclass to the object box of type BoxFigure  
		System.out.println("Line 18: Box:\n"+shapeRef);
		System.out.println();
	}
}
