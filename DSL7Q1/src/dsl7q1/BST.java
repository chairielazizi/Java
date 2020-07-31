package dsl7q1;

public class BST<T extends Comparable<T>>{
    private BSTNode root;
    
    public static final int inorder = 1;
    public static final int preorder = 2;
    public static final int postorder = 3;
    private Queue<T> Q;
    private int traverse;
    
    public BST(){
        root = null;
    }
    public boolean isEmpty(){
        return (root==null);
    }
    public int getSize(){
        return getSize(root);
    }
    public int getSize(BSTNode<T> a){
        if(a==null){
            return 0;
        }
        else{
            return getSize(a.getLeft())+ getSize(a.getRight())+1;
        }
    }
    public boolean contains(T t){
        return find(root,t);
    }
    public boolean find(BSTNode<T> a,T t){
        if(a==null){
            return false;
        }
        else if(t.compareTo(a.getData())<0){
            return find(a.getLeft(),t);
        }
        else if(t.compareTo(a.getData())>0){
            return find(a.getRight(),t);
        }
        else{
            return true;
        }
    }
    public T getElement(T t){
        return (T) getElement(root,t);
    }
    public T getElement(BSTNode<T> a,T t){
        if(a==null){
            return null;
        }
        else if(t.compareTo(a.getData())<0){
            return (T) getElement(a.getLeft(),t);
        }
        else if(t.compareTo(a.getData())>0){
            return (T) getElement(a.getRight(),t);
        }
        else{
            return a.getData();
        }
    }
    
    public void addNode(T t){
        root = add(root,t);
    }
    public BSTNode<T> add(BSTNode<T> a,T t){
        if(a==null){
            a = new BSTNode<T>(t,null,null);
        }
        else if(t.compareTo(a.getData())<=0){
            a.setLeft(add(a.getLeft(),t));
        }
        else{
            a.setRight(add(a.getRight(),t));
        }
        return a;
    }
    
    public void showTree(){
        Q.showQueue();
    }
    public void setOrder(int a){
        traverse =a;
        Q = new Queue<>();
        if(traverse==inorder){
            inOrder(root);
        }
        else if(traverse==preorder){
            preOrder(root);
        }
        else{
            postOrder(root);
        }
    }
    public void inOrder(BSTNode<T> a){
        if(a!=null){
            inOrder(a.getLeft());
            Q.enqueue(a.getData());
            inOrder(a.getRight());
        }
    }
    public void preOrder(BSTNode<T> a){
        if(a!=null){
            Q.enqueue(a.getData());
            preOrder(a.getLeft());
            preOrder(a.getRight());
        }
    }
    public void postOrder(BSTNode<T> a){
        if(a!=null){
            postOrder(a.getLeft());
            postOrder(a.getRight());
            Q.enqueue(a.getData());
        }
    }
    
    public int minimum(){
        int max=0;
        BSTNode currentNode = root;
        while(currentNode!=null){
            if((int)currentNode.getData()<max){
                
            }
        }
        return max;
    }
}
