package day1;

import java.util.Random;

public class HandleException {

	public static void main(String[] args)
	{
		handleException();
		handleGenericException ();
		dodnotHandleException();

	}
	private static void dodnotHandleException()
	{
		System.out.println("\n***********Donot handle Exception*********");
		int a=0,b=0,c=0,d=0;
		Random input= new Random();
		a= input.nextInt();
		b=input.nextInt();
		System.out.println("a= "+ a+" and b = "+b);
		d=a/c;
		System.out.println("c ="+ c);
		
		d=12345/c;
		System.out.println("d is "+d);
	}
	
	private static void handleGenericException ()
	{
		
			System.out.println("\n***********Handle Generic Exception*********");
			int a=0,b=0,c=0,d=0;
			Random input= new Random();
			for(int i=1;i<=5;i++)
			{
				try
			{
			a= input.nextInt();
			b=input.nextInt();
			System.out.println("a= "+ a+" and b = "+b);
			c=a/b;
			d=12345/c;
			}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
					System.out.println(i+ " in catch blook, a/b:"+c+",d: undefined");
					d=0;
				}
				finally
				{
					System.out.println("In finally block,a/b:"+c+ ",d :"+d);
				}
			}
	}
	private static void handleException ()
	{
		
			System.out.println("\n***********Handle Exception*********");
			int a=0,b=0,c=0,d=0;
			int arr[]={0,0,0,0};
			Random input= new Random();
			for(int i=1;i<=6;i++)
			{
				try
				{
				a= input.nextInt();
				b=input.nextInt();
				arr[i-1]=i;
				
				c=a/b;
				d=12345/c;
				System.out.println("arr["+(i-1)+"]=" +i);
				}
					catch(ArithmeticException e)
					{
						System.out.println(e.getMessage());
						System.out.println(i+ " in catch blook, a/b:"+c+",d: undefined" +arr[i-1]);
						d=0;
					}
				catch (ArrayIndexOutOfBoundsException e) 
				{
					System.out.println(e.getMessage());
					System.out.println(i+ " in catch blook, a/b:"+c+",d: undefined\narr["+(i-1)+"]= "+i);
					
					
				}
				finally
				{
					System.out.println("In finally block,a/b:"+c+ ",d :"+d);
				}
		}	
	}
}
