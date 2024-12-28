package StringExample;

public class PracticeExample8 {
	
	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,4,9,4};
		int count=0;
		for(int data:arr)
		{
			if(data==4)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
