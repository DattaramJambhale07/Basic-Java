package string_function;

public class Assignment_69 {

	public static void main(String[] args) 
	{
		// WAP on String Function using equals and equalsIgnoreCase concept
		
		String s1 = "Assignment_69";
		String s2 = "assignment_69";
		
		
//		String Function using equals
		boolean b1 = s1.equals("Assignment_69");
		boolean b2 = s1.equals(s2);
		System.out.println(b1);
		System.out.println(b2);
//		System.out.println(s1.equals("Assignment_69"));
//		System.out.println(s1.equals(s2));

//		String Function using equalsIgnoreCase concept
		boolean b3 = s1.equalsIgnoreCase(s2);
		System.out.println(b3);
//		System.out.println(s1.equalsIgnoreCase(s2));
		
	}

}
