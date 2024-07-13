import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

	class Node {
	    public int value;
	    public Node next;

	    Node(int value) {
	        this.value = value;
	        this.next = null;
	    }
	}

*****************************************************************/

public class Solution {
	public static Node oddEvenLinkedList(Node head) {
		// Write your code here.
		Node oddhead=head;
		Node evenhead=head.next;
		Node odd=oddhead;
		Node even=evenhead;

		while(even!=null && even.next!=null){
			odd.next=even.next;
			odd=odd.next;
			even.next=odd.next;
			even=even.next;
		}

		odd.next=evenhead;

		return oddhead;
	}
}