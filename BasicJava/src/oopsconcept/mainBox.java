package oopsconcept;

import java.util.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class mainBox {

	public static void main(String[] args) 
	{
		Box b1= new Box("box1");
		b1.setWidth(10);
		b1.setheight(20);
		b1.setdepth(2);
		b1.getValue("height");
		b1.getValue("width");
		b1.getValue("depth");
		System.out.println();

		
		Box b2= new Box("box2");
		b2.setValues(100,200, 50);
		b2.getvalues();
		
		Box b3= new Box("box3");
		b3.getvalues();
		
		Box b4= b3;
		b4.setheight(5);
		System.out.println(b4.objName+"="+ Arrays.toString(b4.getValue()));
		System.out.println("In box4");
		b4.getValue("height");
		System.out.println("in box 3");
		b3.getValue("height");
		
		
	}
	
	

}
