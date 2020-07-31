package dsfinalsem2_1617;

import java.util.ArrayList;

public class Queue<T> {
    private ListNode head;
    ArrayList<T> list;
    
    public Queue(T[] items){
//        head = items;
        list = (ArrayList<T>)(T)items;
    }
    public Queue(){
        head = null;
        list = null;
    }
    public void enqueue(T a){
        ListNode newNode = new ListNode(a,null);
        if(head==null){
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
        if(head==null)
            return null;
        T t = (T) head.getData();
        head = head.getLink();
        return t;
    }
    public T getElement(int i){
        return list.get(i);
    }
    public T peek(){
        if(head==null)
            return null;
        return (T)head.getData();
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
    public boolean isEmpty(){
        return(head==null);
    }
    public String toString(){
       String str="";
       ListNode currentNode = head;
       while(currentNode!=null){
           str += currentNode.toString();
       }
       return str;
    }
}
