public class DoublyLinkedList {

    Node head, tail;
    private int size=0;

    DoublyLinkedList(){
        head = tail = null;
    }

    int size(){return size;}

    void insert(int value){addAtLast(value);}

    void addAtLast(int value){
        Node newNode = new Node(value);
        if(size() ==0){
            head = tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    void addAtStart(int value){
        Node newNode = new Node(value);
        if(size()==0){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = head.prev;
        }
        size++;
    }


    void insert(int index, int value)throws Exception{
        if(index > size() || index < 0) throw  new Exception("Illegal Index value");
        if(index==0) {
            addAtStart(value);
        }else if(index ==size()){
            addAtLast(value);
        }else{
            Node curr = head;
            for(int i=0; i< index-1; i++){
                curr = curr.next;
            }

            Node newNode = new Node(value);
            newNode.prev = curr;
            newNode.next = curr.next;
            curr.next.prev = newNode;
            curr.next = newNode;
        }
    }

    void removeLast(){
        if(size()==0) throw new RuntimeException("List is empty");
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    void removeFirst(){
        if(size()==0) throw new RuntimeException("List is empty");
        head = head.next;
        head.prev =null;
        size--;
    }
    void remove(int index){
        if(index >size || index <0) throw  new IndexOutOfBoundsException();
        if(size()==0) throw new RuntimeException("List is empty");
        if(index ==0){
            removeFirst();
        }else if(index == size()){
            removeLast();
        }else{
            Node curr = head;
            for(int i=0; i<index; i++){
                curr =curr.next;
            }
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }
        size--;
    }



}
