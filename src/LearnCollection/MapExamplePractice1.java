package LearnCollection;

import java.util.HashMap;

public class MapExamplePractice1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(101, "Sanika");
		students.put(102, "sneha");
		students.put(102, "tushar");
		students.put(103, "akshata");
		students.put(null, null);
		students.put(null, null);
		
		System.out.println(students);
		System.out.println(students.get(101));
		System.out.println(students.getOrDefault(103, "hello"));
		
	}
	
}
