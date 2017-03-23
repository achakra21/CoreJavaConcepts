import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		
		//key is unique in hashmap but value can be different
		HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1, "a");
		hashMap.put(2, "b");
		hashMap.put(3, "c");
		hashMap.put(4, "d");
		
		  
		for (Integer integer : hashMap.keySet()) {
			
		System.out.println("Key:::"+integer+":::Value:::::"+hashMap.get(integer));
			
		}
		
		//using Iterator
		//getting the key sets
		Set<Integer> keys = hashMap.keySet();
		
		// get the itertor object from keys
		Iterator<Integer> iterator2 = keys.iterator();
		Integer intKeys;
		
		while(iterator2.hasNext()){
			intKeys = iterator2.next();
			System.out.println("Keys::   "+intKeys+"Values::  "+ hashMap.get(intKeys));
			
		
		}
		
		
		
		
		
		
		
	}

}
