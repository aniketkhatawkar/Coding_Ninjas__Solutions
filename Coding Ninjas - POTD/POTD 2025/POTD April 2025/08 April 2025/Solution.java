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
        Node node = new Node(val);
        
        if(pos==0){
            node.next=head;

            return node;
        }

        Node temp = head;

        for(int i=0; i<pos-1 && temp!=null; i++){
            temp=temp.next;
        }

        if(temp==null){
            return head;
        }

        node.next=temp.next;
        temp.next=node;

        return head;
    }
}