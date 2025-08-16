package collection;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("Ani");
		obj.add("suni");
		obj.add("ammu");
		obj.add("sumi");
		obj.add("appu");
		System.out.println(obj);
		
		ArrayList<String> obj2 =new ArrayList<String>();
		obj.add("jan");
		obj.add("feb");
		obj.addAll(obj2);
		System.out.println(obj);
				System.out.println(obj.contains("jan"));
				System.out.println(obj.get(4));
		System.out.println(obj.isEmpty());
		obj.remove(7);
		System.out.println(obj);
		System.out.println(obj.size());
System.out.println();
	}

}
