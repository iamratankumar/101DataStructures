public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.add(6);
        bst.add(9);
        bst.add(3);
        bst.add(2);
        bst.add(5);
        bst.add(4);


        bst.remove(3);

        bst.traverse(ORDER.INORDER);
    }
}