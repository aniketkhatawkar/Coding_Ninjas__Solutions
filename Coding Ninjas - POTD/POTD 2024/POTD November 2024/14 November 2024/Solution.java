import java.util.* ;
import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node insert(Node head, int n, int pos, int val) {
        // Write your code here.
        Node nnode = new Node(val);

        if(pos==0){
            nnode.next=head;
            return nnode;
        }

        Node curr=head;

        for(int i=0; i<pos-1; i++){
            if(curr!=null){
                curr=curr.next;
            }
        }

        if(curr!=null){
            nnode.next=curr.next;
            curr.next=nnode;
        }

        return head;

    }
}