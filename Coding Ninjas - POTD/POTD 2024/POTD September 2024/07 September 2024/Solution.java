import java.util.* ;
import java.io.*; 
/*
    Time Complexity : O(K)
    Space Complexity : O(1)

    Where, K is the position of the node to be inserted in the list.
*/

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

    static Node insert(int k, int val, Node head) {
        // Write your code here.
        Node newnode= new Node(val);

        if(head==null){
            newnode.next=newnode;
            return newnode;
        }

        if(k==0){
            Node temp=head;

            while(temp.next!=head){
                temp=temp.next;
            }

            newnode.next=head;
            temp.next=newnode;

            return newnode; 
        }

        Node curr = head;

        for(int i=0; i<k-1; i++){
            curr=curr.next;
        }

        newnode.next=curr.next;
        curr.next=newnode;

        return head;
        
    }
}