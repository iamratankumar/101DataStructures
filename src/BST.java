import javax.management.openmbean.KeyAlreadyExistsException;

public class BST<T extends Comparable<T> > {
    private Node<T> root = null;
    int size=0;

    public void add(T elm){
        if(!isAvailable(root,elm)){
            root = add(root,elm);
            size++;
        }
    }

    public Node<T> add(Node<T> node, T elm){
        if(node == null)
            node = new Node<>(elm, null,null);

        if(elm.compareTo(node.data)<0) node.left = add(node.left, elm);
        else if(elm.compareTo(node.data)>0) node.right = add(node.right,elm);
        return node;
    }

    public void remove(T elm){
        if(isAvailable(root,elm)){
            root = remove(root, elm);
            size--;
            System.out.println("Element Removed Successfully");
        }else{
            System.out.println("Element doesn't Exists");
        }
    }


    private Node remove(Node node,T elem){
        if(node == null) return null;
        int comp = elem.compareTo((T)node.data);
        if(comp<0) node.left = remove(node.left, elem);
        else if(comp>0) node.right = remove(node.right, elem);
        else {
            if(node.left == null) return node.right;
            else if(node.right ==  null) return node.left;
            else{
                Node temp = findMin(node.right);
                node.data = temp.data;
                node.right = remove(node.right,(T) temp.data);
            }
        }
        return node;
    }

    public void traverse(ORDER order){
        if(order == ORDER.INORDER){
            traverseInOrder(root);
        }else if( order == ORDER.PREORDER){
            traversePreOrder(root);
        }else if(order == ORDER.POSTORDER){
            traversePostOrder(root);
        }else{
            System.out.println("Select Right Order");
        }
    }

    private void traversePreOrder(Node node){
        if(node == null) return;
        System.out.print(node.data);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
    private void traverseInOrder(Node node){
        if(node == null) return;
        traverseInOrder(node.left);
        System.out.print(node.data);
        traverseInOrder(node.right);
    }
    private void traversePostOrder(Node node){
        if(node == null) return;
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(node.data);
    }

    private Node<T> findMin(Node<T> node){
        while(node.left !=null) node = node.left;
        return node;
    }
    private Node<T> findMax(Node<T> node){
        while (node.right != null) node = node.right;
        return node;
    }


    private boolean isAvailable(Node<T> tree,T elm){
        if(tree == null) return  false;
        if(elm.compareTo(tree.data)<0) return isAvailable(tree.left, elm);
        else if(elm.compareTo(tree.data)>0) return isAvailable(tree.right,elm);
        else return true;
    }


}
