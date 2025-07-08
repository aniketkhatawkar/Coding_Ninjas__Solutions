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

        temp=head;
        int n=arr.size();
        int start=0;
        int last=n-1;

        for(int i=0; i<n; i++){
            if(i%2==0){
                temp.data=arr.get(start++);
            }
            else {
                temp.data=arr.get(last--);
            }
            temp=temp.next;
        }

        return head;
	}
}