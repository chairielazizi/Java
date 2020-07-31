package dst6;

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
    //remove
    public T dequeue(){
        if(head == null){
            return null;
        }
        T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }
    //add
    public void enqueue(T a){
        ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        if(head == null){
            head = newNode;
        }
        else{
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    
    public T peek(){
        if(head==null){
            return null;
        }
        else{
            return (T) head.getData();
        }
    }
    
    public void showQueue(){
        if(isEmpty()){
            System.out.println("Empty queue");
        }
        else{
            ListNode currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
            }
            
        }
    }
    
    public void reverse(){
        if(isEmpty()){
            System.out.println("Empty queue");
        }
        else{
            ListNode currentNode = head;
            for(int i=getSize();i>0;i--){
                System.out.println(currentNode.toString());
            }
        }
    }
    
    public void showQueueQ3(){
        if(isEmpty()){
            System.out.println("Empty queue");
        }
        else{
            ListNode currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.q3());
                currentNode = currentNode.getLink();
                
            }
            
        }
    }
}
