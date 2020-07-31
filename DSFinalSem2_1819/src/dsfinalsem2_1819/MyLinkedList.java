package dsfinalsem2_1819;

public class MyLinkedList<T extends Comparable<T>> {
    private Node head;
    
    public MyLinkedList(){
        head = null;
    }
    public int getSize(){
        int count =0;
        Node currentNode = head;
        while(currentNode!=null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    public void addFirst(T a){
        head = new Node(a,head);
    }
    public void addLast(T a){
        Node currentNode = head;
        if(head==null){
            head = new Node(a,null);
        }
        else{
            Node newNode = new Node(a,null);
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    public T removeFirst(){
        if(head!=null){
            T t = (T) head.getData();
            head = head.getLink();
            return t;
        }
        else
            return null;
    }
    public String toString(){
        String str="";
        str += "[size="+getSize()+"] ";
        Node currentNode = head;
        while(currentNode!=null){
            str += currentNode.toString().replace(" --> ", " >> ");
            currentNode = currentNode.getLink();
        }
        return str;
    }
}
