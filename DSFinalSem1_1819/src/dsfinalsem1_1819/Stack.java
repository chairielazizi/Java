package dsfinalsem1_1819;

public class Stack<T> {
    private ListNode head;
    
    public Stack(){
        head = null;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public boolean isFull(){
        return (head!=null);
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
    public void push(T a){
        System.out.println("Push: "+a);
        head = new ListNode(a,head);
    }
    public void pushMany(String a){
        T[] temp = (T[]) a.split(",");
        for(int i=0;i<temp.length;i++){
            head = new ListNode(temp[i],head);
            System.out.println("Push: "+temp[i]);
        }
    }
    public T pop(){
        System.out.println("Pop the top of the stack...");
        if(isEmpty())
            return null;
        T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }
    public void popAll(){
        //head = null;
        System.out.println("There are "+getSize()+" items in the stack. Removing all...");
        while(!isEmpty()){
            System.out.println("Removing "+pop()+" .. ");
        }
    }
    public void display(){
        ListNode currentNode = head;
        if(isEmpty()){
            System.out.println("Stack is empty, nothing to display...");
        }
        else{
            System.out.println("There are "+getSize()+" items int the stack. Displaying...");
            while(currentNode!=null){
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
                System.out.println();
            }
            System.out.println();
        }
    }
}

class ListNode<T>{
    private T data;
    private ListNode link;
    
    public ListNode(){
        data = null;
        link = null;
    }
    public ListNode(T a,ListNode b){
        data = a;
        link = b;
    }
    public void setData(T a){
        data = a;
    }
    public T getData(){
        return data;
    }
    public void setLink(ListNode a){
        link = a;
    }
    public ListNode getLink(){
        return link;
    }
    public String toString(){
        return " <-- "+data;
    }
}