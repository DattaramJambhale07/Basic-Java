package string_functions;

import java.util.Arrays;

public class String_Functions 
{

	public static void main(String[] args) 
	{
		
		String a = "Eclipse and selenium";
		
		int length = a.length();                                   //Returns the length of this string.
		System.out.println("length_of_string: "+length);
		
		String upper = a.toUpperCase();                            //Converts all of the characters in this String to upper case.
		System.out.println("Convert String in upper case: "+upper);
		
		String lower = a.toLowerCase();							   //Converts all of the characters in this String to lower case
		System.out.println("Convert String in lower case: "+lower);
		
		String Before_Trim = "    Before Trim    ";
		System.out.println("Before_Trim: "+Before_Trim);
	
		String After_Trim = Before_Trim.trim();          			//Returns a string whose value is this string, with all leading and trailing space removed
		System.out.println("After_Trim: "+After_Trim);
		
		boolean ends_with = a.endsWith("and");				//Tests if this string ends with the specified suffix/String.
		System.out.println(ends_with);
				
		String [] space_split = a.split(" ");		
		System.out.println(Arrays.toString(space_split));
		
	}

}
