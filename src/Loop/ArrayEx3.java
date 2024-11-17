package Loop;

public class ArrayEx3 {
	
	public static void main(String[] args) {
		
//		int numbers[]= {67,12,90,23,65};
//		
//		for(int i=0;i<numbers.length;i++)
//		{
//			System.out.println(numbers[i]);
//		}
	
		int num2[][]= {{56,14,78,34},{78,35,17,31}};
		
		for(int n[]:num2)
		{
			for(int number:n)
			{
				System.out.println(number);
			}
		}
		
	}

}
