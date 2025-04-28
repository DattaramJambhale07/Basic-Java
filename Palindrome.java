package string_functions;

public class Palindrome {

	public static void main(String[] args) 
	{
		String Input = "racecar";
		String Output = "";
		
		for (int i = Input.length()-1; i >= 0 ; i--)				//S1.length()-1 gives the index of the last character
		{
			
			Output += Input.charAt(i);				//The += operator is shorthand for out = out + S1.charAt(i). It adds the character to the existing out string.
			//char a = Input.charAt(i);
			//Output += a;
		}
	//	System.out.println(Output);
		
		if (Input.equals(Output) == true)			//The statement if (Input.equals(Output) == true) is valid but unnecessary. 		
		//	if (Input.equals(Output))				The cleaner way to write this is just if (Input.equals(Output)).
		{
			System.out.println("The String is Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome String");
		}

	}

}
