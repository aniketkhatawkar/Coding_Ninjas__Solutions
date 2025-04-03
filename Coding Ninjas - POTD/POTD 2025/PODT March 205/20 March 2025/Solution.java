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
        ArrayList<Integer> arr = new ArrayList<>();

        Node temp=head;

        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }

        int n=arr.size();
        temp=head;
        int index=n-1;

        for(int i=0; i<n/2; i++){
            temp.data=arr.get(i);
            temp.next.data=arr.get(index--);
            temp=temp.next.next;
        }

        if(n%2!=0){
            temp.data=arr.get((n/2));
        }

        return head;
	}
}