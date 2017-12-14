package InheritenceInShape;

public class ShapeMain {

	public static void main(String[] args)
	{
		Shape s= new Shape(10);
		s.display();
		Square s1= new Square(20);
		s1.Area();
		s1.perimeter();
		s1.display();
		Rectangle r= new Rectangle(5, 0, 0);
		r.area(20);
		r.perimeter( 2, 2);
		r.display();

	}

}
