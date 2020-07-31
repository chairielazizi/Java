package dsl5q5;

public class Stack<T> {
    private ListNode head;
    
    public Stack(){
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
    public void push(T a){
        head = new ListNode(a,head);
    }
    public T pop(){
        if(isEmpty())
            return null;
        T t = (T) head.getData();
        head = head.getLink();
        return t;
    }
    public T peek(){
        return (T)head.getData();
    }
    public void showStack(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
}
