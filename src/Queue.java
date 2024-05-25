public class Queue<T> {

    private T[] queue;
    private int frontPointer,currPointer;
    private final int capacity;

    Queue(int capacity){
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];
        currPointer=frontPointer=0;
    }


    public void enqueue(T value){
        if(currPointer == capacity) throw  new IndexOutOfBoundsException("Queue Overflow");
        queue[currPointer++] =value;
    }

    public T dequeue(){
        if(frontPointer == currPointer|| frontPointer > currPointer) throw new NullPointerException("Queue is empty");
        return queue[frontPointer++];
    }

    public T peek(){
        return queue[frontPointer];
    }

}
