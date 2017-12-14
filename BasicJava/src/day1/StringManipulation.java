package day1;

public class StringManipulation {

	public static void main(String[] args)
	{
		char[] selenium= {'s','e','l','e','n','i','u','m'};
		String str= new String(selenium);
		
	String str2 = String.valueOf(str);
	System.out.println(str2+" "+"type is  "+str2.getClass().getSimpleName());
	
//	Integer value = 101;//doesnt support  autoboxing and unboxing ,kepler version supports java 7 version 
	//System.out.println("Type of value is "+ value.getClass().getSimpleName());
	
	
	//str2 = String.valueOf(value);
	//System.out.println("Type of value is "+ str2.getClass().getSimpleName());
	
	
	
	String somestr="Welcome to Basic programming";
	int len= somestr.length();
	System.out.println("length of"+somestr+" is "+ len);
	
	
	
	String somestr1 ="Hi Friends";
	System.out.println(somestr+somestr1);
	System.out.println(somestr.concat(somestr1));
	System.out.println(somestr.equals(somestr1));
	System.out.println(somestr.equalsIgnoreCase(somestr1));
	System.out.println(somestr.replace('c', 'n'));
	
	
	System.out.println(somestr1.equals("Hi Friends"));
	System.out.println(str.equals("selenium"));
	
	
		

	}

}
