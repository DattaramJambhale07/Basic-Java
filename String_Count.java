package string_functions;

import java.util.Arrays;

public class String_Count 
{
	static int countofalpha = 0;				//This will hold the count of alphabetic characters in the string.
	static int countofnumeric = 0;				//This will hold the count of numeric digits (0-9) in the string.
	static int countofspace = 0;				// This will hold the count of whitespace characters in the string.

	public static void main(String[] args) 
	{
		// In the Given String Count the number of Alphabets, Numbers, Spaces and Special Character
		
		String s1 = "k v no 2";
		char[] c1 = s1.toCharArray();				//Converts this string into character array format. //char [] : This looks like the same array which used in the main method
		System.out.println(Arrays.toString(c1));    //Not Required  //The Arrays.toString(c1) method converts the character array c1 into a human-readable string representation.
		
		for (int i = 0; i < s1.length(); i++)		// Loop to analyze each character in the array
		{
			boolean b1 = Character.isAlphabetic(c1[i]);				// Check if the character is an alphabet
			boolean b2 = Character.isDigit(c1[i]);					// Check if the character is a digit
			boolean b3 = Character.isWhitespace(c1[i]);				// Check if the character is a whitespace
			
			if (b1 == true)
			{
				countofalpha++;				// If it's an alphabet, increment countofalpha
			}
			if (b2 == true)
			{
				countofnumeric++;			// If it's a digit, increment countofnumeric
			}
			if (b3 == true)
			{
				countofspace++;				// If it's a space, increment countofspace
			}
			
			//System.out.println(b1);
		}	
		
			System.out.println("Count of alphabets are: "+countofalpha);
			System.out.println("Count of numeric are: "+countofnumeric);
			System.out.println("Count of spaces are: "+countofspace);
			
			int b4 = s1.length()-(countofalpha+countofnumeric+countofspace);				// Special character count is the remaining characters
			System.out.println("Count of Special Character: "+b4);
	}
}