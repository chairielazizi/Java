package dsfinalsem1_1617;

public class Stack<T> {
    private ListNode head;
    private int max=8;
    
    public Stack(){
        head = null;
    }
    public void push(T a){
        if(isStackFull())
            System.out.println("stack is full");
        head = new ListNode(a,head);
    }
    public T pop(){
        if(head==null)
            return null;
        T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }
    public T peek(){
        if(head==null)
            return null;
        return (T) head.getData();
    }
    public boolean isStackEmpty(){
        return (head == null);
    }
    public boolean isStackFull(){
        return getSize()==max;
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
    public void showStack(){
        ListNode currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
}
