package CreateInterface;

class Square implements Shape
{
	public Square() 
	{
		
	}

	@Override
	public void compute_area() {
		System.out.println("Area of square=" +length*length+"= "+length*length);
		
	}

	public int getLength() {
		
		return 0;
	} 
	
	public void getSide()
	{
		getLength();
		System.out.println("in square  class");
	}
}

class Triangle implements Shape
{
	int height;
	public Triangle(int side, int height) {
		this.height = height;
	}
		@Override
		public void compute_area() 
		{
			System.out.println("Area of triangle is ("+height+"*"+height+")/2"+(height*height)/2);
			
		}

		@Override
		public int getLength() 
		{
			
			return 0;
		}
		void compute_perimeter(int side)
		{
			System.out.println("Perimeter of triangle is "+(side*height)/2);
		}
}
class Circle implements Shape
{
	private int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	@Override
	public void compute_area() {
		System.out.println("Area of circle is"+Math.PI+"*("+radius+"*"+radius+")= " +(Math.PI*(radius*radius)));
		
	}
	@Override
	public int getLength() {
		return 0;
	}
	public void getRadius()
	{
		System.out.println("Radius="+this.radius);
	}
	}

