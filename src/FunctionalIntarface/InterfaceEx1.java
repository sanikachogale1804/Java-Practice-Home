package FunctionalIntarface;

@FunctionalInterface
interface square
{
	int isEven(int n);
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		
		square s=new square() {
			public int isEven(int n)
			{
				return n%2;
			}
		};
		s.isEven(4);
	}
	
}
