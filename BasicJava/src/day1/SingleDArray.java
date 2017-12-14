package day1;

public class SingleDArray {

	public static void main(String[] args) 
	{
		SingleDArray sd= new SingleDArray();
		sd.singleDimArray();

	}
	
	
	public void singleDimArray()
	{
		//int i;
		int month_days[]= new int[12];
		month_days[0]=31;
		month_days[1]=30;
		month_days[2]=28;
		month_days[3]=27;
		month_days[4]=26;
		month_days[5]=25;
		month_days[6]=24;
		month_days[7]=23;
		month_days[8]=22;
		month_days[9]=21;
		month_days[10]=20;
		month_days[11]=19;
		//for(i=0;i<=11;i++)
		
		//{
		System.out.println(month_days[5]);
		//}
		
		int [] mth_days={1,2,3,4,4,5,6,8,6,10};
		System.out.println("march has"+ " "+mth_days[3]);
	}

}
