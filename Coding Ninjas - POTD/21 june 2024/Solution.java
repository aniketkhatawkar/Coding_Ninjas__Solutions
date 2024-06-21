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

public class Solution {
    public static int binaryToInteger(int n, Node head) {
        // Write your code here.
        Node temp=head;
        double ans=0;
        n--;

        while(temp!=null){
            if(temp.data==1){
                ans+=Math.pow(2,n);
            }
            n--;
            temp=temp.next;
        }

        return (int)ans;
    }
}