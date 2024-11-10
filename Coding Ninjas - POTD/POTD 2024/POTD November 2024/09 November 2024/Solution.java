import java.util.* ;
import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next,prev;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node insert(int k, int val, Node head) {
        // Write your code here.
        Node node = new Node(val);

        if(head==null){
            return node;
        }

        if(k==0){
            node.next=head;
            head.prev=node;

            return node;
        }

        Node curr=head;
        int count=0;


        while(count<k-1 && curr!=null){
            curr=curr.next;
            count++;
        }

        if(curr==null){
            return head;
        }

        node.next=curr.next;
        node.prev=curr;

        if(curr.next!=null){
            curr.next.prev=node;
        }

        curr.next=node;

        return head;

    }
}