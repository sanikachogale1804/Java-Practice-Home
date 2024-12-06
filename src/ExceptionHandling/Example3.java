package ExceptionHandling;

public class Example3 {
	
	public static void throwException()
	{
		throw new NullPointerException("sanika");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		try {
			throwException();
		}catch (NullPointerException e) {
		System.out.println("Exception handled");
		}
		
	}

}
