public class Main {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        for(int i=1; i<=10;i++){
            doublyLinkedList.insert(i);
        }
        doublyLinkedList.insert(5,11);

        doublyLinkedList.remove(0);

    }
}