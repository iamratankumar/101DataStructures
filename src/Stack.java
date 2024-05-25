import java.util.EmptyStackException;

public class Stack<T> {
    private class  Node<T>{
        T item;
        Node<T> next;

        public Node(T item){
            this. item = item;
            this.next = null;
        }

    }

    Node<T> stack = null;
    private int size=0;



    public void push(T value){
        Node<T>  newNode = new Node<>(value);
        if(size() ==0){
            stack = newNode;
        }else{
            newNode.next = stack;
            stack = newNode;
        }
        size++;
    }
    public void pop(){
        if(size()==0) throw new EmptyStackException();
        stack = stack.next;
        size--;
    }

    public int size(){
        return size;
    }
    public T peek(){
        if(size()==0) throw new EmptyStackException();
        return stack.item;
    }

}
