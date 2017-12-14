package day1;

import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args)
	{

		int rand;
		int guess;
		
		rand= (int)(Math.random()*10);
		System.out.println(rand);
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
		
	}

}
