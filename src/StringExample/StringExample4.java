package StringExample;

public class StringExample4 {
	
	public static void main(String[] args) {
		
		String s1="mobileeee";
		
		for(int i=(s1.length()-1);i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
		
		String str="I love Java Programming";
		
		StringBuilder reversedstr=new StringBuilder();
		
		for(int i=(str.length()-1);i>=0;i--)
		{
			reversedstr.append(i);
		}
	System.out.println(reversedstr.toString());	
	}

}
