package dsl4q8;

import java.util.Iterator;

public class CircularLinkedList<T> {
    private ListNode head;
    
    public CircularLinkedList(){
        head = null;
    }
    
    public int length(){
        ListNode currentNode = head;
        int count =0;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
            if(head == currentNode){
                break;
            }
        }
        return count;
    }
    
    public void addCircularNode(T a){
        ListNode currentNode =head;
        if(head == null){
            ListNode newNode = new ListNode(a,null);
            head = newNode;
            newNode.setLink(newNode);
        }
        else{
            while(currentNode.getLink() != head){
                currentNode = currentNode.getLink();
                //head.getLink();
            }
            ListNode newNode = new ListNode(a,head);
            currentNode.setLink(newNode);
        }
    }
    
    public void deleteCircularNode(){
        ListNode currentNode = head;
        if(head != null){
            if(currentNode.getLink() == null){
                head = null;
            }
            else{
                while(currentNode.getLink() != head){
                    currentNode = currentNode.getLink();
                }
                currentNode.setLink(head);
            }
        }
        else{
            System.out.println("List is empty");
        }
    }
    
    public void showCircularList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
            if(head == currentNode){
                System.out.println(currentNode.toString().replace(" --> ", ""));
                break;
            }
        }
            
    }
    
    public T getCircularItem(int index){
        ListNode currentNode = head;
        if(index >= length()){
            System.out.println("Invalid index");
        }
        int count=0;
        while(currentNode.getLink() != head){
            if(count == index){
                break;
            }
            currentNode = currentNode.getLink();
            count++;
        }
        return (T) currentNode.getData();
    }
    
    public CircularLinkedListIterator circularLinkedListIterator(){
        return new CircularLinkedListIterator();
    }
    class CircularLinkedListIterator<T> implements Iterator<T>{
        private ListNode currentNode = head;
        
        public boolean hasNext(){
            return currentNode.getLink() != head;
        }
        public T next(){
            T data = (T) currentNode.getData();
            currentNode = currentNode.getLink();
            return data;
        }
    }
}
