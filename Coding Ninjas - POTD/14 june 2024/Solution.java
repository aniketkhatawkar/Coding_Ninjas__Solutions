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
    Node temp=head, temp1=head;
    int i=1;

    while(temp1!=null){
      if(i%k==0){
        temp=temp1;
      }
      temp1=temp1.next;
      i++;
    }

    return temp;

  }
}