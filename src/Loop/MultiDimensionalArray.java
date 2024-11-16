package Loop;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		int arr1[][]= {{67,12,54},{98,89,12}};
		System.out.println(arr1[0][2]);
		
		System.out.println("====================================");
		int numbers[][]= {{67,12,54},{98,89,12}};
		
		for(int i=1;i<arr1.length;i++)
		{
			for(int j=1;j<3;j++)
			{
				System.out.println(numbers[i][j]);
			}
		}
		
	}

}
