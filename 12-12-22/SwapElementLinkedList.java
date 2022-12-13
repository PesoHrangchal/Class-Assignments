package class_assignment;
//2. WJP of swap two elements in a linked list.

import java.util.Collections;
import java.util.LinkedList;
//12/12/22
public class SwapElementLinkedList {	
		public static void main(String[] args) {
			LinkedList<String> ll = new LinkedList<String>();
			ll.add("Tiger");
			ll.add("Lion");
			ll.add("Hippo");
			ll.add("Elephant");
		System.err.println(" LinkedList before swap: " + ll);
			
		Collections.swap(ll, 0, 2);
		Collections.swap(ll, 1, 3);
		System.err.println(" LinkedList after swap: " + ll);
		
		}
	}
