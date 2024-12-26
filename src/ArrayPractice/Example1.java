package ArrayPractice;

public class Example1 {
	
	public static void main(String[] args) {
		
		int arr[]= {12,-87,35,89,-34,17};
		int count=0;
		for(int n:arr)
		{
			if(n>0)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
