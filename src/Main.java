public class Main {
    public static void main(String[] args) throws Exception{
        SinglyLinkedList linkedList = new SinglyLinkedList();

        for(int i =1; i<=10;i++){
            linkedList.insert(i);
        }
        linkedList.insert(5,15);

        System.out.println(linkedList.size());
        linkedList.traverse();

    }
}
