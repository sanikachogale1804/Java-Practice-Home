package LearnCollection;

import java.util.TreeSet;

public class SetExample4 {
	
	public static void main(String[] args) {
	
		TreeSet<Integer> set=new TreeSet<Integer>((o1,o2)->o2-o1);
		set.add(20);
		set.add(87);
		set.add(56);
		set.add(56);
		set.add(78);
		set.add(10);
		System.out.println(set);
		System.out.println(set.higher(56));
		System.out.println(set.lower(56));
		System.out.println("=========================================");
		System.out.println(set.ceiling(22));
		
	}

}
