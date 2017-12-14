package CreateInterface;

import InheritenceInShape.Rectangle;

public class MainInterface {

	public static void main(String[] args) 
	{
				int rnd= (int) (Math.random()*10);
				System.out.println("random value rnd= "+rnd);
				Square sq = new Square(rnd);
				sq.getSide();
				sq.compute_area(+);
				Circle c= new Circle(rnd);
				c.getRadius();
				c.compute_area();
				Triangle t= new Triangle(rnd, 10);
				t.compute_area();
				t.compute_perimeter(5);
				
				System.out.println("Type shape");
				Shape sh= Square(10);
				sh.compute_perimeter();
				sh= new Circle(4);
				System.out.println("Type shape");
				
				
				
						
	}


}

