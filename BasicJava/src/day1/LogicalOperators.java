package day1;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.OutputUtil;

public class LogicalOperators {

	public static void main(String[] args)
	{
		String output;
		output= "Logical AND (&&)"+
				"\nfalse && false :"+(false && false)
				+"\nfalse && true :"+(false && true)
				+"\ntrue && false :"+(true && false)
				+"\ntrue && true :"+(true && true);
		System.out.println(output);
		
		output= "Logical OR (||)"+
				"\nfalse || false :"+(false || false)
				+"\nfalse || true :"+(false || true)
				+"\ntrue || false :"+(true  || false)
				+"\ntrue || true :"+(true || true);
				
		System.out.println(output);
		
		
		output= "Logical NOT (!)"+
				"\n!false :"+(!false)
				+"\n!true :"+(!true);
		System.out.println(output);
	
		System.out.println("\n*********************************************.");

		int a=100;
		int b=200;
		int c=30;
		
		if((a>b)&&(a>c)){
			System.out.println("a is greater than b and c");
		}
		else if((b>a)&&(b>c)){
			System.out.println("b is greater than a and c");
		}
		else{
			System.out.println("c is greater than and b");
		}
		
		
		if(a>b){
			System.out.println("a >b ");
		}
		if(b>a){
			System.out.println("b>a");
		}
		
		
		
		if(a>b){
			System.out.println("a >b ");
		}
		else{
			System.out.println("b>a");
		}
		
		
		
		
	}

}
