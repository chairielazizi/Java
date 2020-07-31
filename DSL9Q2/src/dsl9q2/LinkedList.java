package dsl9q2;

public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList(){
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
    public void showList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    public void addNode(T a){
        ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        if(head == null){
            head=newNode;
        }
        else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    public boolean linearSearchContain(T t){
        ListNode currentNode = head;
        while(currentNode != null){
            if(t.compareTo((T)currentNode.getData())==0){
                return true;
            }
            currentNode = currentNode.getLink();
        }
        return false;
    }
    
    public int linearSearchCount(T t){
        int count=0;
        ListNode currentNode = head;
        while(currentNode != null){
            if(t.compareTo((T)currentNode.getData())==0){
                count++;
            }
            currentNode = currentNode.getLink();
        }
        return count;
    }
    public boolean linearSearchRange(T t1,T t2,T t){
        ListNode currentNode = head;
        while(currentNode != null){
            if(t.compareTo(t1)>0 && t.compareTo(t2)<0){
                return true;
            }
            currentNode = currentNode.getLink();
        }
        return false;
    }
    public int linearSearchContainRange(T t1,T t2,T t){
        int count=0;
        ListNode currentNode = head;
        while(currentNode != null){
            if(t.compareTo(t1)>0 && t.compareTo(t2)<0){
                count++;
            }
            currentNode = currentNode.getLink();
        }
        return count;
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
        return data+" --> ";
    }
}