import java.util.* ;
import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next;
 Node<T> prev;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node deleteNode(Node head, int pos) {
        // Write your code here.
        if(head==null){
            return null;
        }

        if(pos==0){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            return head;
        }

        Node curr=head;
        int count=0;

        while(curr!=null && count<pos){
            curr=curr.next;
            count++;
        }

        if(curr!=null){
            if(curr.next!=null){
                curr.next.prev=curr.prev;
            }

            if(curr.prev!=null){
                curr.prev.next=curr.next;
            }
        }

        return head;
    }
}