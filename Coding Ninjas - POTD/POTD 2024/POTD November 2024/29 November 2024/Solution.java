import java.util.* ;
import java.io.*; 
public class Solution {
    public static Node findKthFromLast(Node head, int K) {
        // Write your code here
        int size=0;
        Node temp=head;

        while(temp!=null){
            size++;
            temp=temp.next;
        }

        temp=head;

        for(int i=0; i<size-K; i++){
            temp=temp.next;
        }

        return temp;
    }
}
