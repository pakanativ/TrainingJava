package oopsconcept;

public class Box 
{
	protected int width;
	protected int height;
	protected int depth;
	public String objName;
	
	public Box(String objname)
		{
			 objName=objname;
		}
	public void setWidth(int wid)
		{
			width=wid;
		}

	public void setheight(int hig)
	{
		height=hig;
	}
	public void setdepth(int dep)
	{
		depth=dep;
	}
	
	public void setValues(int h, int w, int d)
	{
		height =h; width=w; depth=d;
	}
	public void getValue(String m)
	{
		if(m=="height")
		{System.out.println("height of the box is "+objName+" "+height);}
		if(m=="width")
		{System.out.println("width of the box is "+ objName+" "+width);}
		if(m=="depth")
		{System.out.println("depth of the box is "+ objName+" "+depth);}
		
	}
	public int[] getValue()
	{
		int [] values={height,width,depth};
		return values;
		
	}
	
	public void getvalues()
	{
		System.out.printf("height of the box is "+objName+
				"%d\nwidth of the box is "+ objName+"%d\ndepth of the box is "+ objName+
				"%d\n",height,width,depth);
	}
	
}
