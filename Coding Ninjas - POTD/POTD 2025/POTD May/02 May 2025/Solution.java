import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x) 
  {
    // Write your code here
    Stack<Integer> st = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    st.push(x);

    while(!myStack.isEmpty()){
      temp.push(myStack.pop());
    }

    while(!temp.isEmpty()){
      st.push(temp.pop());
    }

    return st;
  }
}
