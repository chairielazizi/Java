package dst7;

public class Queue<T> {
    private ListNodeQ head;
    
    public boolean isEmpty(){
        return head==null;
    }
    public int getSize(){
        int count=0;
        ListNodeQ currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public T dequeue(){
        if(head==null){
            return null;
        }
        T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }
    
    public void enqueue(T a){
        ListNodeQ newNode = new ListNodeQ(a,null);
        ListNodeQ currentNode = head;
        if(head==null){
            head = newNode;
        }
        else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    
    public T peek(){
        if(head == null){
            return null;
        }
        else{
            return (T) head.getData();
        }
    }
    
    public void showQueue(){
        if(isEmpty()){
            System.out.println("Empty Queue");
        }
        else{
            ListNodeQ currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
            }
        }
    }
}
