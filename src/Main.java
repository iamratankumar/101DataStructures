public class Main {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(7);
        arr.add(9);


        arr.add(0,1);
        //arr.deleteInMiddle(3);
        arr.add(5);
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+ " ");
        }
        arr.clear();
        System.out.println(arr.size());

    }
}