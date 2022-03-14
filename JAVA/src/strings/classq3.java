package strings;

public class classq3
{
	public static void main(String[] args)
	{
		String s="“Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.replace('a','$'));
		boolean isFound =s.contains("collection");
		System.out.println(s.matches("java string pool refers to collection of strings which are stored in heap memory"));
		System.out.println(s.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
		
	
	}

}
