package day1;

import java.util.Scanner;

public class JavaTask1 {

	public static void main(String[] args)
	{
		int i=1;
		int j=1;
		int s=0;
		int num;
		int count=0;
		
		num = (int)(Math.random()*10);
		/*System.out.println("enter the value");// scanner to  take value from console
		Scanner input= new Scanner(System.in);
		num=input.nextInt();*/
		
		System.out.println(num);
		
System.out.print(i+" ,");
System.out.print(j+", ");
/*while(i<=num)
{
	s=i+j;
	System.out.print(s+" , ");
	i=j;
	j=s;	
}*/
do
{
	s=i+j;
	System.out.print(s+" , ");
	i=j;
	j=s;
	count++;
}
while(count<=num);
}
	
}
