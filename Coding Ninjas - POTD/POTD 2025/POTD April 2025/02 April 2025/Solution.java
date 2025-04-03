import java.util.* ;
import java.io.*; 
/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

class Solution {

  public static Node modularNode(int k,Node head) {
    // Write your code here.
    Node temp=head;
    Node ans=head;

    int count=1;

    while(temp!=null){
      if(count++%k==0){
        ans=temp;
      }
      temp=temp.next;
    }

    return ans;

  }
}