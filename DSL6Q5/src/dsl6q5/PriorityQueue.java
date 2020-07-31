package dsl6q5;

public class PriorityQueue<T extends Comparable<T>> {
    private ListNode head;
    
    public PriorityQueue(){
        head = null;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public int getSize(){
        int count=0;
        ListNode currentNode = head;
        while(currentNode!=null){
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
    public T dequeue(){
        if(isEmpty())
            return null;
        T temp = (T)head.getData();
        head = head.getLink();
        return temp;
    }
    public void enqueue(T a){
        if(isEmpty()){
            head = new ListNode(a,null);
        }
        else if(a.compareTo((T)head.getData())>0){
            head = new ListNode(a,head);
        }
        else{
            ListNode currentNode = head;
            while(currentNode.getLink()!=null && (a.compareTo((T)currentNode.getLink().getData())==0 || a.compareTo((T)currentNode.getLink().getData())<0)){
                currentNode = currentNode.getLink();
            }
            if(currentNode.getLink() == null){
                currentNode.setLink(new ListNode(a,null));
            }
            else{
                currentNode.setLink(new ListNode(a,currentNode.getLink()));
            }
        }
    }
    public void showQueue(){
        ListNode currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
        System.out.println();
    }
    public void Enqueue(T a){
        if(isEmpty()){
            head = new ListNode(a,null);
        }
        else if(a.compareTo((T)head.getData())>0){
            head = new ListNode(a,head);
        }
        else{
            ListNode currentNode = head;
            while(currentNode!=null && (a.compareTo((T)currentNode.getData())==0 || a.compareTo((T)currentNode.getData())<0)){
                currentNode = currentNode.getLink();
            }
            if(currentNode == null){
                currentNode = new ListNode(a,null);
            }
            else{
                currentNode = new ListNode(a,currentNode.getLink());
            }
        }
    }
}
