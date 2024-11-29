package LearnCollection;

import java.util.TreeMap;

public class MapExamplePracice4 {
	
     public static void main(String[] args) {
		
    	 TreeMap<Integer, String> map= 
			       new TreeMap<Integer, String>();
	map.put(101, "A");
	map.put(567, "B");
	map.put(456, "C");
	map.put(235, "D");
	map.put(890, "E");
	map.put(200, "F");
	System.out.println(map);
	
	System.out.println(map.keySet());
	System.out.println(map.higherKey(200));
	System.out.println(map.higherEntry(456));
	System.out.println("=========================");
	System.out.println(map.lowerKey(456));
	System.out.println(map.lowerEntry(567));
	System.out.println("=========================");
	System.out.println(map.ceilingKey(237));
	System.out.println(map.ceilingEntry(567));
	System.out.println("=========================");
	System.out.println(map.floorKey(220));
    System.out.println(map.floorEntry(568));
    System.out.println("=========================");
    	 
	}

}
