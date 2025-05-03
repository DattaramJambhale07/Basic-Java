package string_function;

import java.util.Scanner;

public class Assignment_70 
{

	public static void main(String[] args) 
	{
		// WAP to reverse a string
		
		Scanner s1 = new Scanner (System.in);							//Create the Scanner class object for taking the inpput value
		System.out.println("Enter the input String value: ");
		
		String input = s1.next();										// Read the input string from the user
		String output = "";												// Initialize an empty string to store the reversed result
		
		for (int i = input.length()-1; i >= 0; i--)						// Loop through the input string in reverse order
		{
			output += input.charAt(i);									// Store each character in reverse order to the output string
		}

		System.out.println("Reverse String: "+output);					// Print the reversed string
		s1.close();														// Close the Scanner object
	}

}
