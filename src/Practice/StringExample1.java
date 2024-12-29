package Practice;

public class StringExample1 {

	public static void main(String[] args) {
		
		String str= "I love java programming";
	   // System.out.println(str);
	    
	 String words[]=str.split(" ");
	 for(int i=words.length-1;i>=0;i--)
	 {
		 System.out.println(words[i]);
	 }
	  
	}
	
}
