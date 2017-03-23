import java.util.LinkedList;
import java.util.concurrent.LinkedTransferQueue;

public class LinkedListDemo {

	public static void main(String[] args) {
		// linkedlist maintains order
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		linkedList.add("f");
		linkedList.add("g");
		linkedList.add("h");

		for (int i = 0; i < linkedList.size(); i++) {

			System.out.println("The Value::" + linkedList.get(i));

		}

		// Remove a LinkList
		linkedList.remove(linkedList.get(3));

		for (int i = 0; i < linkedList.size(); i++) {

			System.out.println("The Value After Removing::" + linkedList.get(i));

		}

	}

}
