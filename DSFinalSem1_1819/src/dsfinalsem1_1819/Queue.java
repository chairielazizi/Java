package dsfinalsem1_1819;

public class Queue<T> {
    private Node head;
    private int max;
    
    public Queue(){
        head = null;
        max=6;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public boolean isFull(){
        return (getSize()==max);
    }
    public T peek(){
        if(isEmpty())
            return null;
        return (T)head.getData();
    }
    public void enqueue(T a){
        System.out.println("Enqueue: "+a);
        Node newNode = new Node(a,null);
        if(head==null){
            head = newNode;
        }
        else{
            Node currentNode = head;
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    public void enqueueMany(String a){
        T[] temp = (T[]) a.split(",");
        for(int i=0;i<temp.length;i++){
            System.out.println("Enqueue: "+temp[i]);
            Node newNode = new Node(temp[i],null);
            Node currentNode = head;
            if(!isFull()){
                if(isEmpty())
                    head = newNode;
                else{
                    while(currentNode.getLink()!=null){
                        currentNode = currentNode.getLink();
                    }
                    currentNode.setLink(newNode);
                }
            }
            else{
                System.out.println("Queue is full");
            }
        }
    }
    public T dequeue(){
        
        if(isEmpty())
            return null;
        T temp = (T) head.getData();
        System.out.println("Dequeue: "+temp);
        head = head.getLink();
        return temp;
    }
    public void dequeueAll(){
        System.out.println("There are "+getSize()+" items in the queue. Removing them all...");
        while(!isEmpty()){
            //System.out.println("Dequeue: "+dequeue());
            dequeue();
        }
    }
    public void display(){
        if(isEmpty())
            System.out.println("Nothing to display");
        else{
            Node currentNode = head;
            System.out.println("There are "+getSize()+" items int the queue. Displaying...");
            while(currentNode!=null){
                System.out.println(currentNode.toString().replace(" --> ", ""));
                currentNode = currentNode.getLink();
            }
            System.out.println();
        }
    }
    public int getSize(){
        int count=0;
        Node currentNode = head;
        while(currentNode!=null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
}

