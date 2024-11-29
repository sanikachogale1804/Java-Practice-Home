package ExceptionHandling;

public class ExamplePractice1 {

	public static void main(String[] args) {
		
		System.out.println("hello");
		try
		{
			System.out.println(5/0);
		}catch(ArithmeticException e)
		{
			System.out.println("number can not divideby zero");
		}
		
		System.out.println("Code after execution");
		
	}
	
}
