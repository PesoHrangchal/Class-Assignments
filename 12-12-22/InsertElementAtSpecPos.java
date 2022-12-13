package class_assignment;
//1. WJP to insert the specified element 
//12/12/22
//at the specified position in the linked list.
import java.util.LinkedList;

public class InsertElementAtSpecPos {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Tiger");
		ll.add("Lion");
		ll.add("Hippo");
		ll.add("Elephant");
		System.err.println("List before adding element:"+ll);
		ll.add(1,"Rhino");
		System.err.println("List after adding Rhino at position 2:"+ll);
	}
}
