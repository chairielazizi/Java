package dsl6q5;

public class Queue<T> {
    private ListNode head;
    
    public Queue(){
        head = null;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public int getSize(){
        int count = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    public void enqueue(T a){
        ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        if(head==null)
            head = newNode;
        else{
            while(currentNode.getLink()!=null)
                currentNode = currentNode.getLink();
            
            currentNode.setLink(newNode);
        }
    }
    public T dequeue(){
        if(isEmpty())
            return null;
        T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }
    public T peek(){
        return (T)head.getData();
    }
    public void showQueue(){
        if(isEmpty())
            System.out.println("Empty queue");
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
}
