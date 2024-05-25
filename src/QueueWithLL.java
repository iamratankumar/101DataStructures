import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueWithLL<T> {
    LinkedList<T> queue = new LinkedList<>();


    public int size(){return queue.size();}
    public void enqueue(T value){
        queue.addLast(value);
    }

    public T dequeue() throws Exception{
        if(size()==0) throw  new Exception("Queue is Empty");
        return queue.removeFirst();
    }

    public T peek(){
        return  queue.getFirst();
    }

}
