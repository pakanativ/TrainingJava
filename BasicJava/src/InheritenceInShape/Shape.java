package InheritenceInShape;

public class Shape 
{
	protected int length;
	public Shape(int length) 
	{
		this.length = length;
		System.out.println("from parent class");
	}
	public void Area(int length)
	{
		System.out.println("In shape class");
	}
	
	public void  parameter(int length)
	{
		System.out.println("in Shape class");
	}
	
	public void display()
	{
		System.out.println("in parent class");
	}
	

}
