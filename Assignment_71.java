package string_function;

import java.util.Scanner;

public class Assignment_71 {

	public static void main(String[] args) 
	{
		// WAP to check if the given string is a Palindrome?
		
		Scanner s1 = new Scanner (System.in);										//Create the Scanner class object for taking the inpput value
		System.out.println("Enter the Input String Value: ");
		
		String input = s1.next();  //saippuakivikauppias							// Read the input string from the user
		String output = "";															// Initialize an empty string to store the reversed result
		
		for (int i = input.length()-1; i >= 0; i--)									// Loop through the input string in reverse order
		{
			output += input.charAt(i);												// Store each character in reverse order to the output string
		}
		
		System.out.println("Reverse String: "+output);								// Print the reversed string
			
		if (input.equals(output))													// Compare input and output String
		{
			System.out.println("The string value is PALINDROME");					// Print the output if it is palindrome
		}
		else
		{
			System.out.println("The String value is not a PALINDROME");				// Print the output if it is not a palindrome
		}	
		s1.close();																	// Close the Scanner object
	}

}
