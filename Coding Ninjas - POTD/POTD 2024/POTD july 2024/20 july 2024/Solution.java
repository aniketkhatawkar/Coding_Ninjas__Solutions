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
        if(head==null){
            return null;
        }

        Node lessh=new Node(0);
        Node greterh=new Node(0);
        Node less=lessh, greter=greterh;

        while(head!=null){
            if(head.data < X){
                less.next=head;
                less=less.next;
            }
            else {
                greter.next=head;
                greter=greter.next;
            }
            head=head.next;
        }

        greter.next=null;
        less.next=greterh.next;

		
		return lessh.next;
    }
}