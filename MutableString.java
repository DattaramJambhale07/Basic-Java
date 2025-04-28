package string_functions;

public class MutableString 
{
public static void main(String[] args) 
	{
	String first_name = "Dattaram";
	System.out.println(first_name);		// first_name string value isn't changes here.

	StringBuilder s1 = new  StringBuilder("Dattaram");
	s1.append(" Jambhale");
	System.out.println(s1);          //example of mutable string where first string value is changed
	}
}

