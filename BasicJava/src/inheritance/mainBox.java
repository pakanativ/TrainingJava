package inheritance;

import java.util.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class mainBox {

	public static void main(String[] args) 
	{
		BoxWeight bw= new BoxWeight(10, 20, 5,2, "Child class Boxweight bw");
		bw.getvalues();
		System.out.println(Arrays.toString(bw.getValue()));
		bw.setWeight(4);
		System.out.println(bw.getweight());
		bw.getValue();
	
	}
	
	

}
