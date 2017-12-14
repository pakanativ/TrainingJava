package day1;

import java.util.Scanner;

public class MathOps {

	public static void main(String[] args) 
	{
		MathOps m= new MathOps();
		m.basicMaths();
		m.CheckEvenOdd();
	}
	
	public void basicMaths()
	{
		float a=10.0f;
		float b=20.0f;
		int c;
		c=(int)(a+b);
		System.out.println(c);
		
		c=(int)(a*b);
		System.out.println("a+b="+c);
		
		c=(int)(a+b);
		System.out.println("a+b="+c);
		
		c=(int)(a-b);
		System.out.println("a+b="+c);
		
		float f=a/b;
		System.out.println("a+b="+f);
		
		int d=0;
		System.out.println("d="+ d++);
		System.out.println("d="+d);
		System.out.println("d="+ ++d);
		
	}
	
	public  void CheckEvenOdd()
	{
		int num;
		System.out.println("Enter  a number");
		Scanner input= new Scanner(System.in);
		num=input.nextInt();
		input.close();
		
		
		if(num %2==0)
		{
			System.out.println("Entered number " + num +" is even");
		}
		else
			System.out.println("Entered number " + num +" is odd");
	
	}
	
	
	
	

}
