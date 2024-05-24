public class SinglyLinkedList {
    Node head = null;

    public void insert(int value){
        addAtLast(value);
    }
    void addAtFirst(int x){
        Node newNode = new Node(x);
        if(head == null){
          head = newNode;
        }else {
        newNode.next = head;
        head = newNode;
        }
    }
    void addAtLast(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
        }else{
            Node curr = head;
            while (curr.next !=null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void insert(int index, int value){
        Node newNode = new Node(value);
        if(index == 0 && head == null){
            head = newNode;
        }else {
            Node prev = head;//1,2,3,4  => 3
            for (int i = 1; i < index; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }

    }

    public void remove(int index){
        if(head == null) throw new NullPointerException("List is Empty");
        if(index == 0)  head = head.next;
        Node curr = head;
        for(int i=1; i<index;i++){
            curr = curr.next;
        }
        if (curr == null) throw new IndexOutOfBoundsException();
        curr.next = curr.next.next;
    }
    public void traverse(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.item+" ");
            curr = curr.next;
        }
    }

}
