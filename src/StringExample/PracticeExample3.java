package StringExample;

public class PracticeExample3 {
	
	public static void main(String[] args) {
		
		int arr[]= {3,2,6,7,8,9,3,1,6,5,9};
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
		
	}

}
