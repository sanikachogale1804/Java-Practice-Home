package Loop;

public class Whileloopex2 {
	
	public static void main(String[] args) {
		int n=906;
		int digitcount=0;
		
		while(n!=0)
		{
		    n=n/10;
			digitcount++;
		}
		System.out.println(digitcount);
		
		if(digitcount>4)
		{
			System.out.println("number is to large");
		}
		else
		{
			System.out.println("number is small");
		}
	}

}
