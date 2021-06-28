package soalBinaryTree;
public class BinaryTree {
    Node root;
    public boolean isEmpty(){
        return (root==null);
    }
    
    public void insert(Node input){
        if (isEmpty()){
            root = input;
        }else{
            Node current = root;
            Node parent = null;
            boolean diKiri = true;
            while (current != null){
                parent = current;
                if (current.data < input.data){
                    current = current.right;
                    diKiri = false;
                }else if (current.data > input.data){
                    current = current.left;
                    diKiri = true;
                }else{
                    System.out.println("data"+input.data+"is exist");
                    break;
                }
            }
            if (diKiri){
                parent.left = input;
            }else{
                parent.right = input;
            }
        }
    }
    
    public void preOrder(){
        preOrdered(root);
    }
    
    public void inOrder(){
        inOrdered(root);
    }
    
    public void postOrder(){
        postOrdered(root);
    }
    
    public void preOrdered(Node root){
        if (root != null){
            System.out.print(root.data+" ");
            preOrdered(root.left);
            preOrdered(root.right);
        }
    }
    
    public void inOrdered(Node root){
        if (root != null){
            inOrdered(root.left);
            System.out.print(root.data+" ");
            inOrdered(root.right);
        }
    }
    
    public void postOrdered(Node root){
        if (root != null){
            postOrdered(root.left);
            postOrdered(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    public Node search (int key){
        Node siNode = null;
        Node current = root;
        while (current != null){
            if (current.data == key){
                return siNode;
            }else{
                if (current.data < key){
                    current = current.right;
                }else{
                    current = current.left;
                }
            }
        }
        return siNode;
    }
}
