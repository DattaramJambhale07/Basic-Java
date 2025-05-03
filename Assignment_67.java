package string_function;

import java.util.Scanner;

public class Assignment_67 
{
	public static void main(String[] args) 
	{
		// WAP on String Function using toupperCase,toLowerCase,length,charAt,trim concepts

		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter the String Value: ");
		
		String input = s1.next(); //input : 1nkLjBOS3QpAh1D9aTZrXossaxJCQw4fTIT9FmQSfKnI
		
		//Program on String Function using toupperCase
		String upper =	input.toUpperCase();
		System.out.println("Sting in Upper Case: "+upper);
		
		//Program on String Function using toupperCase
		String lower = input.toLowerCase();
		System.out.println("Sting in Upper Case: "+lower);
		
		//Program on String Function to count length
		int String_length = input.length();
		System.out.println("Length of the String: "+String_length);
		
		//Program on String Function to charAt
		char c1 = input.charAt(20);
		System.out.println("Charact at index 20: "+c1);
		
		//Program on String Function using Trim concept
		String s2 = " Ram Ram Jay Raja Ram ";
		String output2 = s2.trim(); 
		System.out.println(output2);
		
		s1.close();
		
		
	}

}
