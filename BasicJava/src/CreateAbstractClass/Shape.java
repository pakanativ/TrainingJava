package CreateAbstractClass;

abstract class Shape 
{
	int length;
	public Shape(int l){
		this.length = l;
		System.out.println("Shape's overloaded constructor with only one parameter,I");
	}
	public Shape()
	{
		System.out.println("Shape's defauld constructor");
	}

	abstract void compute_area();

	public int getLength()
	{
		return length;
	}
}
