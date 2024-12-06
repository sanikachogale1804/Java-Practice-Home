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
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
