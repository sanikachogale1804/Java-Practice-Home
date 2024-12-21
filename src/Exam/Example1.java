package Exam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Example1 {
	
	public static void main(String[] args) {
		
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Blue");
        map.put(3, "Green");
        map.put(4, "Yellow");
        map.put(5, "Orange");
  
        
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
        
        HashSet<Integer> keySet = new HashSet<>(map.keySet());

        System.out.println("Keys in the HashSet:");
        for (Integer key : keySet) {
            System.out.println(key);
        }
        
	}

}
