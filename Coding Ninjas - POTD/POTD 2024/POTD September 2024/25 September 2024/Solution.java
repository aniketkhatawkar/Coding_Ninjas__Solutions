/************************************************************************

    Following is the representation of the Singly Linked List node:

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

************************************************************************/

public class Solution {
    public static boolean detectCycle(Node<Integer> head) {
        // Write your code here.
        if(head==null || head.next==null){
            return false;
        }

        Node slow=head;
        Node faster=head;

        while(faster!=null && faster.next!=null){
            slow=slow.next;
            faster=faster.next.next;

            if(faster==slow){
                return true;
            }
        }

        return false;
    }
}