import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//no duplicate value allowed
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("d");
		hashSet.add("e");
		hashSet.add("e");

		for (Iterator<String> iterator = hashSet.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.println("The value is::" + string);

		}
	}
	

}
