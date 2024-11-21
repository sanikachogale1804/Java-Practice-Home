package StringExample;

public class StringExample4 {
	
	public static void main(String[] args) {
		
		String s1="mobileeee";
		
		for(int i=(s1.length()-1);i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
		
		String str="I love Java Programming";
		String[] word=str.split(" ");
		StringBuilder reversedstr=new StringBuilder();
		
		for(int i=word.length-1;i>=0;i--)
		{
			reversedstr.append(word[i]);
			if(i>0)
			{
				reversedstr.append(" ");
			}
			
		}
		
	System.out.print(reversedstr.toString());	
	
	}

}
