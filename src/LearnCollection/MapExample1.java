package LearnCollection;

import java.util.HashMap;

public class MapExample1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		hashmap.put(101, "sanika");
		hashmap.put(102, "sneha");
		hashmap.put(103, "akshata");
		System.out.println(hashmap);
		hashmap.put(null, null);
		System.out.println(hashmap);
	}

}
