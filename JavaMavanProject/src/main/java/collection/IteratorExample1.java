package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("Ani");
		obj.add("suni");
		obj.add("ammu");
		obj.add("sumi");
		obj.add("appu");
		System.out.println(obj);
		
		Iterator<String> it=obj.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());	
		}

	}

}
