package dsfinalsem1_1617;

public class Queue<T> {
    private ListNode head;
    
    public Queue(){
        head = null;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public int size(){
        int count=0;
        ListNode currentNode = head;
        while(currentNode!= null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    public T peek(){
        if(isEmpty())
            return null;
        return (T)head.getData();
    }
    public void enqueue(T a){
        ListNode newNode = new ListNode(a,null);
        if(isEmpty()){
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
    public void tostring(){
        ListNode currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    public void ChangeOrder(int k){
        ListNode currentNode = head;
        T data;
        for(int i=0;i<k-1;i++){
            data = (T) dequeue();
            enqueue(data);
        }
    }
}
