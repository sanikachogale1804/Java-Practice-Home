package StringExample;

public class Example1 {

	public static void main(String[] args) {
		String a="HelloWolrd";
		System.out.println(a.length());
		
		System.out.println(a.concat("world"));
		
		String b="Java Programming";
		System.out.println(b.toUpperCase());
		
		String c="Java";
		String d="java";
		
		System.out.println(c.equalsIgnoreCase(d));
		
		String e="banana";
		System.out.println(e.replace("a","o"));
	}
	
}
