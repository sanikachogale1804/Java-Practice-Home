package LearnCollection;

import java.util.HashMap;
import java.util.Set;

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
		System.out.println(students.getOrDefault(1033, "hello"));
		System.out.println(students.remove(103));
		System.out.println(students);
		System.out.println(students.keySet());
		System.out.println(students.values());
		
		System.out.println("================================");
		Set<Integer> keys = students.keySet();
		for(Integer k:keys)
		{
			System.out.println(k);
		}
	}
	
}
