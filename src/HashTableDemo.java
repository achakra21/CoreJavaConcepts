import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.omg.CORBA.PUBLIC_MEMBER;

public class HashTableDemo {

	static Hashtable<Integer, String> hashtable;

	public static void main(String[] args) {

		HashTableDemo hashTableDemo = new HashTableDemo();
		hashTableDemo.initHashTable();
		// add an element
		hashTableDemo.addElement(hashtable, 12, "adding");// if you add duplicate key it would replace the prev
		// remove element
		hashTableDemo.deleteElement(hashtable, 12);
		// search elements
		hashTableDemo.searchElement(hashtable, 1);
		// multi threading
		hashTableDemo.addSync();
	}

	/**
	 * init the hashtable
	 * 
	 * @param hashtable
	 */
	public void initHashTable() {

		hashtable = new Hashtable<Integer, String>();
		hashtable.put(1, "a");
		hashtable.put(12, "b");
		hashtable.put(3, "c");
		hashtable.put(4, "d");
		hashtable.put(5, "e");
		// hashtable.put(null, null);null key and value is not allowed

		// iterating over the table
		for (Map.Entry<Integer, String> map : hashtable.entrySet()) {
			System.out.println("Key::" + map.getKey() + " " + "Value::" + map.getValue());
		}

	}

	/**
	 * Add element using key & value
	 * 
	 * @param hashtable
	 * @param key
	 * @param value
	 */
	public void addElement(Hashtable<Integer, String> hashtable, Integer key, String value) {

		hashtable.put(key, value);
		System.out.println("After added the value::" + hashtable);

	}

	/**
	 * delete
	 * 
	 * @param hashtable
	 * @param key
	 */
	public void deleteElement(Hashtable<Integer, String> hashtable, Integer key) {

		hashtable.remove(key);
		System.out.println("After deleted the key::" + hashtable);

	}

	/**
	 * search element using key
	 * 
	 * @param hashtable
	 * @param key
	 */
	public void searchElement(Hashtable<Integer, String> hashtable, Integer key) {
		hashtable.get(key);
		System.out.println("The Search value for::" + key + "=>" + hashtable.get(key));
	}

	/**
	 * check multi threading operations are working
	 */
	public void addSync() {
		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				addElement(hashtable, 13, "Sysnc1");
				System.out.println("The hashTableValue in Thread 1::" + hashtable);

			}
		};

		Runnable runnable2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("The hashTableValue in Thread 2::" + hashtable);

			}
		};

		Thread thread1 = new Thread(runnable1);
		thread1.start();
		Thread thread2 = new Thread(runnable2);
		thread2.start();

	}

}
