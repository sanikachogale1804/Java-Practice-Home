package Exam;

public class Example5 {
	
	public static void main(String[] args) {
		 String string1 = "the sky is blue";

	        String string2 = "the sky is bright";

	        String lastWord1 = getLastWord(string1);
	        String lastWord2 = getLastWord(string2);
	        
	        System.out.println(lastWord1+" and "+lastWord2);
	        
	}
	        public static String getLastWord(String str) {
		        String[] words = str.split(" ");
		        return words[words.length-1];
		    }
	}


