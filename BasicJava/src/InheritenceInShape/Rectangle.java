package InheritenceInShape;

public class Rectangle extends Shape
{
	int breadth, height;
	int area,perm;

	public Rectangle(int length,int br,int he) 
	{
		super(length);
		breadth=br;
		height=he;
	}
	
	public void area(int bre)
	{
		area=length*bre;
		System.out.println("Area of rectangle is" + area);
		
	}
	public void perimeter(int bre,int he)
	{
		perm=length*bre*he;
		System.out.println("the perimeter of rectangle is"+perm);
	}
	
	public void display()
	{
		System.out.println("From rectangle  class");
		System.out.println("area and perimeter are"+area+" & "+perm);
	}
	

}
