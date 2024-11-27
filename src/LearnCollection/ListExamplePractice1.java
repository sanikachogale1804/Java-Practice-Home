package LearnCollection;

import java.util.ArrayList;

public class ListExamplePractice1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(78);//0 index
		list.add(78);//1 index
		list.add(89);//2 index
		list.add(56);//3 index
		list.add(32);
		System.out.println(list);
		
		System.out.println(list.size()-1);
		System.out.println(list.remove(3));
		System.out.println(list);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(101);
		list2.add(102);
		list2.add(103);
	}

}
