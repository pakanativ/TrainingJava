package inheritance;

import oopsconcept.Box;


	class BoxWeight extends Box
	{
		int weight;
		public BoxWeight(int w,int h,int d,int m,String objName)
		{
			super(objName);
			width=w;
			height=h;
			depth=d;
			weight=m;
			
		}
		public int getweight()
		{
			return weight;//10
		}
		public void setWeight(int wt)
		{
			weight=wt;//4
		}
	
	public int[] getValue()
	{
		int[] values={height,width,depth,weight};
		return values;
	}
	
	}
	

