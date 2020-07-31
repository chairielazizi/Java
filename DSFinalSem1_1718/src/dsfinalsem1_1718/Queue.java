package dsfinalsem1_1718;

public class Queue<T> {
    private ListNode head;
    
    public Queue(){
        head = null;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public T peek(){
        if(isEmpty())
            return null;
        return (T)head.getData();
    }
    public void enqueue(T a){
        ListNode newNode = new ListNode(a,null);
        if(head==null){
            head = newNode;
        }
        else{
            ListNode currentNode = head;
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    public T dequeue(){
        if(isEmpty()){
            System.out.println("Empty queue");
        }
        T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }
    public void display(){
        ListNode currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
}
