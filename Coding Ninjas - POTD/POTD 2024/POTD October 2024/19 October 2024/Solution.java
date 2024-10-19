import java.util.* ;
import java.io.*; 
public class Stack {
	// Initialize your data structure.
	private Deque<Integer> deque; 
	Stack() {
		deque=new ArrayDeque<>();
	}

	// Pushes 'X' into the stack. Returns true if it gets pushed into the stack, and false otherwise.
	public boolean push(int x) {
		// Write your code here.
		deque.add(x);

		return true;
	}

	// Pops top element from Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
	public int pop() {
		// Write your code here.
		if(deque.isEmpty()){
			return -1;
		}

		return deque.removeLast();
	}

	// Returns the topmost element of the stack. In case the stack is empty, it returns -1.
	public int top() {
		// Write your code here.
		if(deque.isEmpty()){
			return -1;
		}

		return deque.peekLast();
	}

	// Returns true if the stack is empty, otherwise false.
	public boolean isEmpty() {
		// Write your code here.
		return deque.isEmpty();
	}

	// Returns the number of elements currently present in the stack.
	public int size() {
		// Write your code here.
		return deque.size();
	}
}