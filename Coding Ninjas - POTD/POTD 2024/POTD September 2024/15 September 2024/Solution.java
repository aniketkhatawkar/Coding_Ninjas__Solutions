import java.util.* ;
import java.io.*; 
/****************************************************************
    Following is the Linked List node structure

    class Node {
    public:
        int data;
        Node *next;
        Node(int data) {
            this->data = data;
            this->next = NULL;
        }
    };

*****************************************************************/

public class Solution {
    public static Node removeNodes(Node head, int k) {
        // Write your code here.
        Node temp=new Node(0);
        temp.next=head;
        Node curr=temp;

        while(curr!=null && curr.next!=null){
            if(curr.next.data==k){
                curr.next=curr.next.next;
            }
            else {
                curr=curr.next;
            }
        }

        return temp.next;
    }
}