package string_functions;

import java.util.Arrays;
import java.util.Scanner;

public class String_Count_2 {
	
	static int count_of_alpha = 0;
	static int count_of_numeric = 0;
	static int count_of_spaces = 0;

	public static void main(String[] args) {
		// Drawback of this code is that due to scanner class is used the space will not be consider

		
		Scanner input_string = new Scanner(System.in);
		System.out.println("Enter the String Value:");
		String s1 = input_string.next();
		
		char[] c1 = s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(s1.length());
		
		for (int i = 0; i < c1.length-1; i++)
		{
			boolean Check_alpha = Character.isAlphabetic(c1[i]);
			boolean Check_numeric = Character.isDigit(c1[i]);
			boolean Check_spaces = Character.isWhitespace(c1[i]);
			
			if(Check_alpha) count_of_alpha++;
			if(Check_numeric) count_of_numeric++;
			if(Check_spaces) count_of_spaces++;
		
		}
		System.out.println("Count of alphabets are: "+count_of_alpha);
		System.out.println("Count of numeric are: "+count_of_numeric);
		System.out.println("Count of Spaces are: "+count_of_spaces);
		
		int count_of_spcl_char = s1.length()-(count_of_alpha+count_of_numeric+count_of_spaces);
		System.out.println("Count of special characters are: "+count_of_spcl_char);
		
		input_string.close();
		
	}

}
