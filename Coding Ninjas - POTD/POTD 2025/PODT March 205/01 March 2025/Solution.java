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
        Node nNode = new Node(val);

        if(k==0){
            nNode.next=head;
            if(head!=null){
                head.prev=nNode;
            }

            return nNode;
        }

        Node temp= head;
        int count=0;

        while(count<k-1 && temp!=null){
            temp=temp.next;
            count++;
        }

        if(temp==null){
            return head;
        }

        nNode.next=temp.next;
        nNode.prev=temp;

        if(temp.next!=null){
            temp.next.prev=nNode;
        }

        temp.next=nNode;

        return head;
    }
}