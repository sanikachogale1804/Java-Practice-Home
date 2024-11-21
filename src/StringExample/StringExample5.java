package StringExample;

public class StringExample5 {
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		
		System.out.println(sb.replace(0, 2, "*********"));
		System.out.println(sb.append("world"));
	}

}
