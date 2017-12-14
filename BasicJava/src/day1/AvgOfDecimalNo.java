package day1;

import java.util.Scanner;

public class AvgOfDecimalNo {

	public static void main(String[] args) 
	{
		
		//double a=10.1, b=20.2,c=30.33;
		double num=0.0;
		double sum=0.0;
		double avg; 
		
		for(int i=0;i<3;i++)
		{
	System.out.println("enter   values");
	Scanner input = new Scanner(System.in);
	num= input.nextDouble();
	sum=num+sum;
		}
		avg=((sum)/3);
		System.out.println("the avg of 3 number: (x+y+z)/2 =" +" "+avg);

	}

}
