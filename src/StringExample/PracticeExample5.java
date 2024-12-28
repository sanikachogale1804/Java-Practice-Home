package StringExample;

public class PracticeExample5 {
	
	public static void main(String[] args) {
		
		int arr[]= {12,67,-78,63,-90,-45};
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
