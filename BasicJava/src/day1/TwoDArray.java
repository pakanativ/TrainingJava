package day1;

public class TwoDArray {

	public static void main(String[] args) 
	{
	
		TwoDArray td= new TwoDArray();
		td.doubleDimArray();
	}
	public void doubleDimArray()
	{
		int i,j;
		
		int twoD[][]= new int[6][6];
		for(i=0;i<6;i++)
		{
			for(j=0;j<6;j++)
			{
				twoD[i][j]=(int) (Math.random()*10);
				
			}
		}
		
		System.out.println(twoD[2][4]);
		System.out.println(twoD[4][4]);
		
		for(i=0;i<6;i++)
		{
			for(j=0;j<6;j++)
			{
				System.out.print(twoD[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
