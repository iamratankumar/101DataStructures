import java.util.NoSuchElementException;

public class DynamicArray {
    private int arr[], curSize=0,capacity=2;

    public DynamicArray(int capacity){
        if (capacity <0) throw new IllegalArgumentException("Illegal Capacity "+ capacity);
        this.capacity = capacity;
        arr = new int[capacity];
    }
    public void add(int x){
        reSizeArray();
        arr[curSize++] = x;
    }

    public  void reSizeArray(){
        if(curSize+1 > capacity){//resizing array
            capacity*=2;
            int[] temp = new int[capacity];
            for(int i=0; i<arr.length;i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }
    }


    private void shrinkArray(){
        if((capacity/2) >= curSize){
            capacity /=2;
            int[] temp = new int[capacity];
            for(int i=0; i<arr.length;i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }
    }
    public int get(int idx){
        if(idx >curSize-1) throw  new IndexOutOfBoundsException();
        return arr[idx];
    }
    public  int getIndex(int x){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        throw  new NoSuchElementException("No element found "+ x);
    }

    public void add(int index, int item){
        reSizeArray();
        int temp[] = new int[capacity];
        int iloc=0;
        for(int i=0; i< arr.length-1;i++){
            if(i == index){
                temp[index] = item;
                iloc++;
            }
            temp[iloc++] = arr[i];
        }
        curSize++;
        arr = temp;

    }
    //[1,2,3,4,5]
    //[1,2,4,5] //2
    public void deleteInMiddle(int idx){
        int temp[] = new int[--curSize];
        int iloc =0;
        for(int i=0; i<temp.length;i++){
            if(i ==idx){
                iloc++;
            }
            temp[i]=arr[iloc++];
        }
        arr= temp;
        shrinkArray();
    }
    public void deleteLastItem(){
        int temp[]= new int[--curSize];

    }

    public int size(){return curSize;}





}
