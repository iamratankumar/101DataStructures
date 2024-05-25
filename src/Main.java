public class Main {
    public static void main(String[] args)  throws Exception{
        StackWithArray<Integer> stack = new StackWithArray<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


/*        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.size());*/


//        Queue<Integer> queue = new Queue<>(10);
//
//        for(int i=1; i<=10; i++){
//            queue.enqueue(i);
//        }
//        queue.dequeue();
//
//        //System.out.println(queue.dequeue());
//        System.out.println(queue.peek());


        QueueWithLL<Integer> queue = new QueueWithLL<>();

        for(int i=1; i<=10; i++){
            queue.enqueue(i);
        }
        queue.dequeue();
        queue.dequeue();

        //System.out.println(queue.dequeue());
        System.out.println(queue.peek());


    }
}