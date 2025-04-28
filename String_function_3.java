package string_functions;

import java.util.Arrays;

public class String_function_3 
{
	public static void main(String[] args) 
	{
		String s1 = "Software Testing";
		
		String out_1 = s1.replace('S', 'L');								// Returns a string resulting from replacing all occurrences of oldChar in this string with newChar. 
		System.out.println("Replacing the character in the String: "+out_1);
		
		String out_2 = s1.replace("Software", "Automation");				// Replaces each substring of this string that matches the literal targetsequence with the specified literal replacement sequence.
		System.out.println("Replace one String to Another: "+out_2);
		
		String out_3 = s1.replaceAll("[A-Z]", "");							// Replaces each substring of this string that matches the given regular expression with thegiven replacement. 
		System.out.println("Replace all capital letters with the blank value: "+out_3);
		
		String out_4 = s1.replaceAll("[a-z]", "");
		System.out.println("Replace all small letters with the blank value: "+out_4);
		
		Boolean b1 = s1.endsWith("g");
		System.out.println("The String ends with given input is: "+b1);
		
		String [] out_5 = s1.split(" ");									// Splits this string around matches of the given regular expression.						
		System.out.println("This will split the output where there is a space: "+Arrays.toString(out_5));
				
		String [] out_6 = s1.split(" ", 2);
		System.out.println("This will split the output where there is a space into the given int value: "+Arrays.toString(out_6));
	}
}
