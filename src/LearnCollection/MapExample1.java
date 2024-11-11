package LearnCollection;

import java.util.HashMap;
import java.util.Set;

public class MapExample1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		hashmap.put(101, "sanika");
		hashmap.put(102, "sneha");
		hashmap.put(103, "akshata");
		System.out.println(hashmap);
		hashmap.put(null, null);
		System.out.println(hashmap);
		hashmap.put(null, null);
		System.out.println(hashmap);
		
		System.out.println(hashmap.get(107));
		System.out.println(hashmap.getOrDefault(106, "hello"));
		
		System.out.println(hashmap.remove(103));
		System.out.println(hashmap);
		System.out.println("======================================");
		System.out.println(hashmap.keySet());
		System.out.println(hashmap.values());
		
		Set<Integer> keys=hashmap.keySet();
		for(Integer k:keys)
		{
			 System.out.println(k+ hashmap.get(k));
		}
		System.out.println(hashmap.containsKey(102));
		
		System.out.println(hashmap.containsValue("akshata"));
	}

}
