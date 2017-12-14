package createcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectinExample {

	public static void main(String[] args) 
	{	
		countDuplicateChars("Alpha neumeric");
	}
public static void countDuplicateChars(String str)
{
	System.out.println("Giver string = "+str);
	Map<Character, Integer> map= new HashMap<Character,Integer>();
	char[] chars=str.toCharArray();
	System.out.println("char[2] = "+chars[2]);
	for(Character ch:chars)
	{
		if(map.containsKey(ch))
		{
			map.put(ch,map.get(ch)+1);
		}
		else
		{
			map.put(ch,1);	
		}
	}
System.out.println("Method one for listing all characters");
	Set<Character> keys=map.keySet();
	for(Character ch:keys)
	{
		System.out.println("char" +ch+" "+map.get(ch));
	}
	
System.out.println("Method 2 for listing CCcharacters");
Set<?> set= map.entrySet();
Iterator<?> itr= set.iterator();
while(itr.hasNext())
	{
	Map.Entry me= (Map.Entry) itr.next();
	System.out.println(me.getKey()+":"+me.getValue());
	}

}

}
