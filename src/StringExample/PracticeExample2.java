package StringExample;

public class PracticeExample2 {

	public static void main(String[] args) {
		
		String arr[]= {"Mango","Banana","Kivi","Pineapple","Apple"};
		for(int i=arr.length-1;i>=0;i--)
		{
			String reversedstr=new StringBuilder(arr[i]).reverse().toString();
			System.out.println(reversedstr);
		}
	}
	
}
