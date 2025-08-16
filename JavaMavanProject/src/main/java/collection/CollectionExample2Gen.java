package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample2Gen {

	public static void main(String[] args) {
		List<String>obj=new ArrayList<String>();
		obj.add("ani");
		obj.add("ani");
		obj.add("ammini");
		obj.add("janvi");
		obj.add("alan");
		System.out.println(obj);
		obj.set(2, "Ammu");
		System.out.println(obj);
		System.out.println(obj.indexOf("ani"));
		System.out.println(obj.lastIndexOf("ani"));
		obj.remove(1);
		System.out.println(obj);
		System.out.println(obj.get(3));
		System.out.println(obj.contains("janvi"));
	}

}
