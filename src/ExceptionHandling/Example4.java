package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example4 {
	
	public static void fileHandline() throws FileNotFoundException
	{
		new FileInputStream("abc.txt");
	}
	
	public static void readFile(String fileName) throws IOException
	{
		if(fileName==null)
		{
			throw new IllegalArgumentException("File cannot be null");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("sanika");
		try {
			fileHandline();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			readFile("abs.txt");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
