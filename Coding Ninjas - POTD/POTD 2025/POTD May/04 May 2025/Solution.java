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
        Node temp=head;
        Node temp1 = new Node(val);

        if(pos==0){
            temp1.next=head;
            return temp1;
        }

        for(int i=0; i<pos-1; i++){
            temp=temp.next;
        }

        if(temp==null){
            return head;
        }

        
        temp1.next=temp.next;

        temp.next=temp1;

        return head;

    }
}