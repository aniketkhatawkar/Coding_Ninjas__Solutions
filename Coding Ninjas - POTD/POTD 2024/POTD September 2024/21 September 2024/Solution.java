import java.util.* ;
import java.io.*; 
public class Deque 
{
    // Initialize your data structure.
    int arr[];
    int front;
    int rear;
    int size;
    int capacity;
    public Deque(int n) 
    {
        // Write your code here.
        arr=new int[n];
        front=-1;
        rear=-1;
        capacity=n;
        size=0;
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
        // Write your code here.
        if(isFull()){
            return false;
        }

        if(isEmpty()){
            front=0;
            rear=0;
        }
        else {
            front=(front-1 +capacity)%capacity;
        }

        arr[front]=x;
        size++;

        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        // Write your code here.
        if(isFull()){
            return false;
        }

        if(isEmpty()){
            front=0;
            rear=0;
        }
        else {
            rear=(rear+1)%capacity;
        }

        arr[rear]=x;
        size++;

        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        // Write your code here.
        if(isEmpty()){
            return -1;
        }

        int popele=arr[front];

        if(front==rear){
            front=-1;
            rear=-1;
        }
        else {
            front=(front+1)%capacity;
        }

        size--;
        return popele;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        // Write your code here.
        if(isEmpty()){
            return -1;
        }

        int popele=arr[rear];

        if(front==rear){
            front=-1;
            rear=-1;
        }
        else {
            rear=(rear-1 + capacity)%capacity;
        }

        size--;
        return popele;
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        // Write your code here.
        if(isEmpty()){
            return -1;
        }

        return arr[front];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
        // Write your code here.
        if(isEmpty()){
            return -1;
        }

        return arr[rear];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        // Write your code here.
        return size == 0;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        // Write your code here.
        return size == capacity;
    }
}
