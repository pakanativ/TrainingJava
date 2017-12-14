package CreateAbstractClass;

public class Square extends Shape
{ 
	public Square(int side) {
		super(side);
	}

	void compute_area() 
	{
		System.out.println("Area of square=" +length*length+"= "+length*length);

	}	
	public void getSide()
	{
		getLength();
		System.out.println("in square  class");
	}
}

class Triangle extends Shape
{
	int height;
	public Triangle(int side, int height) {
		super(side);
		this.height = height;
	}
	@Override
	void compute_area() {
		System.out.println("Area of triangle is ("+height+"*"+height+")/2"+(height*height)/2);

	}
	void compute_perimeter(int side)
	{
		System.out.println("Perimeter of triangle is "+(side*height)/2);
	}
}
class Circle extends Shape
{
	private int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}

	void compute_area() {
		System.out.println("Area of circle is"+Math.PI+"*("+radius+"*"+radius+")= " +(Math.PI*(radius*radius)));

	}
	public void getRadius()
	{
		System.out.println("Radius="+this.radius);
	}
}

