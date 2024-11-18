import java.util.* ;
import java.io.*; 
/****************************************************************
    Following is the Linked List node structure

    class Node
    {
    public:
        int data;
        Node *next;
        Node(int data)
        {
            this->data = data;
            this->next = NULL;
        }
    };

*****************************************************************/

public class Solution{
	public static Node modifyLL(Node head){
		// Write your code here.
        if(head==null || head.next==null){
            return head;
        }

        List<Node> node = new ArrayList<>();

        Node curr=head;
        while(curr!=null){
            node.add(curr);
            curr=curr.next;
        }

        int left=0, right=node.size()-1;
        Node dummy = new Node(0);
        Node temp = dummy;

        while(left<=right){
            temp.next=node.get(left++);
            temp=temp.next;

            if(left<=right){
                temp.next=node.get(right--);
                temp=temp.next;
            }
        }

        temp.next=null;

        return dummy.next;
	}
}