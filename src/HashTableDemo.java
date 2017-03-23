import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<Integer,String>();
		hashtable.put(1, "a");
		hashtable.put(2, "b");
		hashtable.put(3, "c");
		hashtable.put(4, "d");
		hashtable.put(5, "e");
		
	//using enumeration	
		//get the enumeration
		Enumeration<Integer> enumeration = null ;
		//get the all the enumeration
		enumeration = hashtable.keys();
		
		//while enumeration has more elements 
		while ( enumeration.hasMoreElements()){
			
			Integer  values = enumeration.nextElement();
			
			
			System.out.println(hashtable.get(values));
			
		}
		
		//using iteration
		
		//get all the key sets
		Set<Integer> keys = hashtable.keySet();
		
		// get iterator object
		Iterator<Integer> iterator = keys.iterator();
		Integer integer;
		
		while (iterator.hasNext()) {
			
			
			//get the key
			integer = iterator.next();
			if(integer == 1){
				iterator.remove();
			}
			System.out.println("Keys::   "+integer+""+"Values::  "+hashtable.get(integer) );
			
						
		}
	}
}
