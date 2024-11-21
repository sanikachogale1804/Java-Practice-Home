package StringExample;

public class StringExample3 {
	
	public static void main(String[] args) {
		
		System.out.println("   h      e    ll     o        ".trim()+"Wolrd");
		
		System.out.println("sanika".length());
		System.out.println("aple".charAt(2));
		System.out.println("Sneha".charAt(4));
		
		System.out.println("==============================");
		System.out.println("sanikaa".indexOf('n',2));
		System.out.println("banana".indexOf('a',4));
		System.out.println("Apple".indexOf('p',2));
		System.out.println("laptop".indexOf('p',3));
		System.out.println("==============================");
		System.out.println("sanikachogale".indexOf('a',6));
		System.out.println("==================================");
		String s2="bottle";
		char arr[]=s2.toCharArray();
		for(char ch:arr)
		{
			System.out.println(ch);
		}
		
		String s3="siddhesh";
		
	}

}
