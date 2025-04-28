package string_functions;

public class String_buffer {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		StringBuffer address = new StringBuffer ("Ram Nagar 108");
		System.out.println(address);
		
		address.append(", Madhuban");
		System.out.println(address);
		
		address.insert(3, " Raj");
		System.out.println(address);
		
		address.replace(14, 17, "124");
		System.out.println(address);
		 
//		Ram Raj Nagar 108, Madhuban
//		012345678901234567890123456

		System.out.println(address.substring(19));
		System.out.println(address.substring(0, 7));
		
		address.delete(12, 17);
		System.out.println(address);
		
		System.out.println(address.charAt(2));

		System.out.println(address.capacity());
		
		System.out.println(address.reverse());
		
		System.out.println(address.length());
	
		
	
	}

}
