package string_function;

public class Assignment_84 
{;
	public static void main(String[] args) 
	{
		// WAP on string functions using replace, replaceAll, substring, matches, repeat
		
		String s1 = "grotechminds";
//					 012345678901
		
		String s2 = "Automation_Course";
		
		System.out.println(s1.substring(7));					// Single-Argument substring()
		System.out.println(s1.substring(0, 7));					// Double-Argument substring()
	
		System.out.println(s1.repeat(2));						// Repeat String function
		
		System.out.println(s1.replace('g', 'b'));				// Replace String function
//		System.out.println(s1.replaceAll("grotechminds", "Automation_Course")); // Replace All String function
		System.out.println(s1.replaceAll(s1, s2));				// Replace All String function
		
		
		//matches: Returns the Boolean Value 
		
		System.out.println(s1.matches("............"));			// //Check if the given string consist exact "n" letters in it without using length method ////each dot contain each index position
		
		System.out.println(s1.matches("g(.)*"));				// (.*) this act same as Like% of SQL
		System.out.println(s1.matches("(.)*s"));
		System.out.println(s1.matches("(.)*tech(.)*"));
		
	}
}
