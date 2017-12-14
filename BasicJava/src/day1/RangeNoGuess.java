package day1;

import java.util.Scanner;

public class RangeNoGuess {

	public static void main(String[] args)
	{
		
		int rand;
		int guess;
		int count=0;
		int sum=0;
		
		
		rand = (int)(Math.random()*10);
		System.out.println(rand);
		
		do
		{
		count++;
		System.out.println("enter value");
		Scanner input= new Scanner(System.in);
		guess=input.nextInt();
		if(rand==guess)
		{
			System.out.println("Both the numbers are same");
		}
		else
		{
			System.out.println("Numbers are not same");
		}
		sum=guess+sum;
		}while((rand!=guess));
		System.out.println("count="+" "+count);
		System.out.println("sum of values entered="+" "+sum);
	}

}
