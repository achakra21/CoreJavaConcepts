import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	HashMap<Integer, String> hashMap;

	public static void main(String[] args) {
		HashMapDemo hashMapDemo = new HashMapDemo();
		hashMapDemo.init();
		hashMapDemo.addElement(12, "add");
		hashMapDemo.addSync();;
	}

	public void init() {
		// key is unique in hashmap but value can be different
		hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "a");
		hashMap.put(2, "b");
		hashMap.put(3, "c");
		hashMap.put(4, "d");
		hashMap.put(null, null);// null key allowed only one null can be many time
		hashMap.put(5, "e");

		for (Integer integer : hashMap.keySet()) {
			System.out.println("Key:::" + integer + ":::Value:::::" + hashMap.get(integer));
		}
	}
	
	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void addElement(Integer key,String value) {
		hashMap.put(key, value);
		System.out.println("After adding values into :::"+hashMap);
	}
	
	/**
	 * 
	 * @param key
	 */
	public void removeElement(Integer key) {
		hashMap.remove(key);
		System.out.println("After remove values into :::"+hashMap);
	}
	
	/**
	 * 
	 * @param key
	 */
	public void searchElement(Integer key) {
		hashMap.get(key);
		System.out.println("The Search Value is:::"+hashMap.get(key));
	}
	/**
	 * Synchronize add operation on HashMap
	 */
	public void addSync() {
		
		Runnable runnable1 = new Runnable() {
			
			@Override
			public void run() {
				addElement(11, "Thread1");
				System.out.println("Values is Thread 1::"+hashMap);
				
			}
		};
		Thread thread1 = new Thread(runnable1);
		thread1.start();
		
		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				addElement(12, "Thread 2");
				System.out.println("Values is Thread 1::"+hashMap);
			}
		};
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		
	}

}
