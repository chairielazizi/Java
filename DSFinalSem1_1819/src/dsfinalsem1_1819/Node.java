package dsfinalsem1_1819;

public class Node<T> {
    private T data;
    private Node link;
    
    public Node(){
        data = null;
        link = null;
    }
    public Node(T a,Node b){
        data = a;
        link = b;
    }
    public void setData(T a){
        data = a;
    }
    public T getData(){
        return data;
    }
    public void setLink(Node a){
        link = a;
    }
    public Node getLink(){
        return link;
    }
    public String toString(){
        return data + " --> ";
    }
}
