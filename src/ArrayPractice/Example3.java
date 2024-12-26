package ArrayPractice;

public class Example3 {
	
	public static void main(String[] args) {
		
		int arr[]= {4,7,8,2,4,3,6,4};
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
