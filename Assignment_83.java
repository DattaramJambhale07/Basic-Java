package string_function;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_83 
{	
	static int count_of_alpha = 0;
	static int count_of_numbers = 0;
	static int count_of_spaces = 0;
	
	public static void main(String[] args) {
		
		//WAP to count the number of alpahebets, numeric letters,spaces and special characters used in the given String                
		
		Scanner s1 = new  Scanner (System.in);
		System.out.print("Enter the input String: ");
		String in = s1.nextLine();
		char [] c1 = in.toCharArray();															// Converts the input string into an array of characters.
		System.out.println(Arrays.toString(c1));												// Prints the character array for debugging or verification.
		
		for (int i = 0; i < in.length(); i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);											// to check if the character is a letter.
			boolean b2 = Character.isDigit(c1[i]);												// to check if it’s a digit.
			boolean b3 = Character.isWhitespace(c1[i]);											// to check for spaces (including tabs, new lines, etc.)
			
			if (b1) count_of_alpha++;
			if (b2) count_of_numbers++;
			if (b3) count_of_spaces++;
		}
		int count_of_spcl_char = in.length()-(count_of_alpha+count_of_numbers+count_of_spaces);	// Calculating Special Characters
		
	
//		Displaying Results:
		
		System.out.println("Input String Length: "+in.length());
	
		System.out.println("Count of alphabets: "+count_of_alpha);
		System.out.println("Count of numbers: "+count_of_numbers);
		System.out.println("Count of spaces: "+count_of_spaces);
		System.out.println("Count of special characters: "+count_of_spcl_char);
		
		s1.close();
	}

}
