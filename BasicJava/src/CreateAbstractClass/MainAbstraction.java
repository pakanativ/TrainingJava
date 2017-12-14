package CreateAbstractClass;

public class MainAbstraction {

	public static void main(String[] args) 
	{
				int rnd= (int) (Math.random()*10);
				System.out.println("random value rnd= "+rnd);
				Square sq = new Square(rnd);
				sq.getSide();
				sq.compute_area();
				Circle c= new Circle(rnd);
				c.getRadius();
				c.compute_area();
				Triangle t= new Triangle(rnd, 10);
				t.compute_area();
				t.compute_perimeter(5);
	}

}

