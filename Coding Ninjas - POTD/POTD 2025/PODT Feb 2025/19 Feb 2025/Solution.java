import java.util.* ;
import java.io.*; 

public class Solution {

    static class MinStack {
        Stack<Integer> st;
        Stack<Integer> mst;

        // Constructor
        MinStack() {
            // Write your code here.
            st=new Stack<>();
            mst=new Stack<>();
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            // Write your code here.
            st.push(num);
            if(mst.isEmpty() || num<=mst.peek()){
                mst.push(num);
            }
        }

        // Function to remove the top element of the stack.
        int pop() {
            // Write your code here.
            if(st.isEmpty()){
                return -1;
            }

            int ele=st.pop();
            if(ele==mst.peek()){
                mst.pop();
            }

            return ele;
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            // Write your code here.
            if(st.isEmpty()){
                return -1;
            }
            else {
                return st.peek();
            }
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            // Write your code here.
            if(mst.isEmpty()){
                return -1;
            }
            else {
                return mst.peek();
            }
        }
    }
}