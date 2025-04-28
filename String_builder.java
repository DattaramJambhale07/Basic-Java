package string_functions;

public class String_builder {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		StringBuilder path = new StringBuilder("This PC");
		
		path.append(" > Users");
		System.out.println(path);
		
		path.insert(7, " > Windows C");
		System.out.println(path);
		
		path.replace(22, 27, "Windows");
		System.out.println(path);
		
		path.append(101);
		System.out.println(path);
		
		path.delete(29, 32);
		System.out.println(path);
		
//		This PC > Windows C > Windows
//		01234567890123456789012345678
		
		System.out.println(path.charAt(18));
		
		String out1 = path.substring(22);
		System.out.println(out1);
		String out2 = path.substring(10, 19);
		System.out.println(out2);
		
		System.out.println(path.length());
		System.out.println(path.capacity());
		
		path.reverse();
		System.out.println(path);
		
		
		
	}

}
