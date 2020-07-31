package dsl6q3;

public class Queue<T> {
    private ListNode head;
    
    public Queue(){
        head = null;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public int getSize(){
        int count=0;
        ListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
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
            System.out.println("Queue is empty");
        }
        T temp = (T)head.getData();
        head = head.getLink();
        return temp;
    }
    public T peek(){
        if(head==null){
            return null;
        }
        return (T)head.getData();
    }
    public void showQueue(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
}
