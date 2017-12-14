package createcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Address {

	private String name,street;
	private String city;
	private String state;
	private String code;
	
	public Address(String n, String s, String c, String st,
			String cd) {
		
		this.name = n;
		this.street = s;
		this.city = c;
		this.state = st;
		this.code = cd;
	}

	public String toString()
	{
		return  name+"\n"+street+"\n"+city+"\n"+state+"\n"+code;
	}
}
	public class MailList
	{

	public static void main(String[] args) 
	{
		
		List<Address> ml= new ArrayList<Address>();
		Address address1= new Address("rilvi", "tiruvala", "tiruvalla", "kerala","689103");
		ml.add(address1);
		ml.add(new Address("abhi", "tiruvala", "tiruvalla", "kerala","689103"));
		ml.add(new Address("Divya", "edathva", "tiruvalla", "kerala","689109"));
		
		System.out.println("The given address are");
		Iterator<Address> itr= ml.iterator();
		while(itr.hasNext())
		{
			Object element= itr.next();
			System.out.println(element+"\n");
		}
		
		
		//second method
		
		int count=1;
		for(Address element:ml)
		{
			System.out.println("Address"+count);
			System.out.println(element);
			System.out.println();
			count++;
		}
		
		//no iteration, simply access the element in the list ml
		System.out.println();
		System.out.println("Address@pos1\n"+ml.get(0)+"\n");
		System.out.println("Address@pos2\n"+ml.get(1)+"\n");
		System.out.println("Address@pos3\n"+ml.get(2)+"\n");
		}
	}
	

