package class_assignment;
//12/12/22
//3. WJP to shuffle the elements in a linked list.
import java.util.Collections;
import java.util.LinkedList;

public class ShuffleLinkedList {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Tiger");
		ll.add("Lion");
		ll.add("Hippo");
		ll.add("Elephant");
	System.err.println(" LinkedList before shuffle: " + ll);
	Collections.shuffle(ll);
	System.err.println(" LinkedList after shuffle: " + ll);
	
	}
}
