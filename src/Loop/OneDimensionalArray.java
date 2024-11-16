package Loop;

public class OneDimensionalArray {
	
	public static void main(String[] args) {
		
		int numbers[]= {56,87,12,90,13};
		System.out.println(numbers[0]);
		System.out.println(numbers.length);
		
		System.out.println("======================");
		for(int num:numbers)
		{
		    System.out.println(num);
		}
		
		String weekdays[]= {"mon","tue","thur","fir","sat","sun"};
		System.out.println(weekdays[3]);
	}

}
