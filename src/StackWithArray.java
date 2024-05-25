import java.util.EmptyStackException;

public class StackWithArray<T> {

    private T[] stack;
    private int size=0,capacity=16;

    public StackWithArray(){
        this.stack = (T[]) new Object[capacity];
    }

    public int size(){return size;}

    public void push(T value){
        if(size == capacity){
            capacity *=2;
            T[] tempStack = (T[]) new Object[capacity];
            for (int i=0; i< stack.length; i++){
                tempStack[i] = stack[i];
            }
            stack = tempStack;
        }
        stack[size++] = value;
    }

    public void pop(){
        if(size() ==0) throw new EmptyStackException();
        stack[--size] = null;
    }
    public T peek(){
        if(size() ==0) throw new EmptyStackException();
        return  stack[size-1];
    }

}
