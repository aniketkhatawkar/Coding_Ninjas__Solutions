import java.util.* ;
import java.io.*; 
public class NQueue {
	// Initialize your data structure.
	private int[] arr;
	private int[] front;
	private int[] rear;
	private int[] next;
	private int free;
	public NQueue(int n, int s) {
		// Write your code here.
		arr=new int[s];
		front=new int[n];
		rear=new int[n];
		next=new int[s];

		Arrays.fill(front, -1);
		Arrays.fill(rear, -1);

		for(int i=0; i<s-1; i++){
			next[i]=i+1;
		}

		next[s-1]=-1;
		free=0;
	}

	// Enqueues 'X' into the Mth queue. Returns true if it gets pushed into the queue, and false otherwise.
	public boolean enqueue(int x, int m) {
		// Write your code here.
		if(free==-1){
			return false;
		}

		int i=free;
		free=next[i];

		if(front[m-1]==-1){
			front[m-1]=i;
		}
		else {
			next[rear[m-1]]=i;
		}

		next[i]=-1;
		rear[m-1]=i;
		arr[i]=x;

		return true;
	}

	// Dequeues top element from Mth queue. Returns -1 if the queue is empty, otherwise returns the popped element.
	public int dequeue(int m) {
		// Write you code here.

		if(front[m-1]==-1){
			return -1;
		}

		int i=front[m-1];
		front[m-1]=next[i];

		if(front[m-1]==-1){
			rear[m-1]=-1;
		}

		next[i]=free;
		free=i;

		return arr[i];
	}
};