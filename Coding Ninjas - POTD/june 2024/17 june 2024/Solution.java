import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       	class Node {
    	int data;
    	Node next;

    	Node(int x) {
        	this.data = x;
        	this.next = null;
    	}
};

*****************************************************************/

public class Solution {
    public static Node findPartition(Node head, int X) {
        // Write your code here.
        if(head==null)
			return null;

		Node lesshead=new Node(0);
		Node greterhead= new Node(0);

		Node less=lesshead;
		Node greter = greterhead;

		Node curr=head;

		while(curr!=null){
			if(curr.data < X){
				less.next=curr;
				less=less.next;
			}
			else {
				greter.next=curr;
				greter=greter.next;
			}
			curr=curr.next;
		}

		greter.next=null;
		less.next=greterhead.next;
		
		return lesshead.next;
    }
}