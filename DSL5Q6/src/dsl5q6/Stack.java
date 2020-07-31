package dsl5q6;

public class Stack<T> {
    private ListNode head;
    
    public Stack(){
        head = null;
    }
    public boolean isEmpty(){
        return (head == null);
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
    public void push(T a){
        ListNode newNode = new ListNode(a,head);
        head = newNode;
    }
    public T pop(){
        if(isEmpty()){
            return null;
        }
        T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }
    public T peek(){
        if(isEmpty()){
            return null;
        }
        return (T)head.getData();
    }
    public void showStack(){
        ListNode currentNode = head;
        while(currentNode!= null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
}
