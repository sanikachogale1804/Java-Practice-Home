package StringExample;

public class StringExample2 {
	
	public static void main(String[] args) {
		
		String a="Hello";
		String b="HELLO";
		
		String c=new String("hello world");
		String d=new String("hello world");
		
		System.out.println("============================");
	
		System.out.println(a.equals(b));
		System.out.println(a.equals("Hello"));
		System.out.println(a.equals("HELLO"));

		System.out.println("============================");
		
		System.out.println(a.equalsIgnoreCase(c));

		System.out.println("============================");
		
		String e="A";
		String f="a";
		
		System.out.println(e.compareTo(f));
		
		System.out.println("============================");
		String name="INDIA";
		System.out.println(name.toLowerCase());
	}

}
