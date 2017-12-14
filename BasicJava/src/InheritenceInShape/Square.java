package InheritenceInShape;

public class Square extends Shape
{

	int param,area;
	public Square(int length) 
	{
		super(length);
	}
		public void Area()
		{
			area=length*length;
			System.out.println("The  area of square is " + area);
		}
		public void  perimeter()
		{
			param=4*length;
			System.out.println("the perimeter of square is " +param);
		}
		
		public void display()
		{	
			System.out.println("From square  class");
			System.out.println("area and perimeter are"+area+" and"+ param);
		}
		
		
	

}
