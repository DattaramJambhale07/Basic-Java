package string_functions;


class Reverse_String1 
{
	 void A2()                                       //Used this method
	{
		String S1 = "GroTechMinds";                  
		String out = "";							//Taking a blank string to store the Reverse value so that it'll start fresh
		
		// Iterate through the string from the end to the beginning
		for (int i = S1.length()-1; i >= 0; i--)	//Using loop here so that we'll get different index values through i variable
		{
			
			out += S1.charAt(i);					//The += operator is shorthand for out = out + S1.charAt(i). It adds the character to the existing out string.			
			
			//char char_at_index = S1.charAt(i);
			//out = out + char_at_index;     
			
		}
		System.out.println("Reverse String: "+out);
	}
	
}

public class Reverse_String extends Reverse_String1
{
	String s1 = "GroTechMinds";
	
	void A1()        								  //Don't used this method
	{
		System.out.println("Reverse String:");
		
		// Iterate through the string from the end to the beginning
		for (int i = 11; i >= 0; i--)
		{
			System.out.print(s1.charAt(i));				//The Return type is in Char format not in String Format, hence this is not a right method
		}
	}
	
	public static void main(String[] args) 
	{
		
		Reverse_String d = new Reverse_String();
		System.out.println("forward String: "+d.s1);
		d.A2();
		d.A1();
		
		
		
		
		//------------------------------------------------
		
	/*	System.out.print(s1.charAt(5));
		System.out.print(s1.charAt(4));
		System.out.print(s1.charAt(3));
		System.out.print(s1.charAt(2));
		System.out.print(s1.charAt(1));
		System.out.print(s1.charAt(0));  */	
	
	}

}


