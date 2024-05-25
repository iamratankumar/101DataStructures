public class SinglyLinkedList {
    private Node head = null;
    private int size=0;

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
        size++;
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
        size++;
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
        size++;

    }

    public void remove(int index)throws Exception{
        if(head == null) throw new NullPointerException("List is Empty");
        if(index > size || index<0) throw new Exception("Illegal index Value");
        if(index == 0)  head = head.next;
        Node curr = head;
        for(int i=1; i<index;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }

    void removeFirst(){
        if(size ==0) throw new NullPointerException("List is Empty");
        head = head.next;
        size--;
    }
    void removeLast(){
        if(size ==0) throw new NullPointerException("List is Empty");
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;//[1,2,3,4]
        }
        curr.next = null;
        size--;

    }

    int size(){return size;}

    public void traverse(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.item+" ");
            curr = curr.next;
        }
    }


    //Extra
    //find the middle

    public int findMiddle(){
        if(size ==0) throw new NullPointerException("List is Empty");
        if(size ==1) return head.item;
        Node tortoise = head;
        Node hare = head;

        while (tortoise !=null && hare !=null && hare.next !=null){
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return tortoise.item;

    }

}
