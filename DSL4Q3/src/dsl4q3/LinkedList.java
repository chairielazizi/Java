    package dsl4q3;

public class LinkedList<T> {
    private ListNode head;
    private int size;
    
    public LinkedList(){
        head = null;
    }
    public int length(){
        ListNode currentNode = head;
        int count=0;
        while(currentNode!=null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public void clear(){
        head = null;
    }
    
    public boolean isEmpty(){
        return (head==null);
    }
    
    public void showList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    
    public void addNode(T a){
        ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        if(head==null){
            head = newNode;
        }
        else{
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    
    public void deleteNode(){
        ListNode currentNode = head;
        ListNode previousNode = head;
        if(head != null){
            if(currentNode.getLink() != null){
                head = null;
            }
            else{
                while(currentNode.getLink() != null){
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
            }
        }
        else{
            System.out.println("The list is empty");
        }
    }
    
    public void addFrontNode(T a){
        head = new ListNode(a,head);
    }
    
    public void deleteFrontNode(){
        if(head != null){
            head =head.getLink();
        }
        else{
            System.out.println("The list is empty");
        }
    }
    /*
    public boolean contains(T a){
        boolean found = false;
        ListNode currentNode = head;
        while(currentNode != null){
            if(a.compareTo((T) currentNode.getData())== 0){
                found = true;
                break;
            }
            currentNode = currentNode.getLink();
        }
        return found;
    }
    */
    public void setFront(T t){
        if(head !=null){
            head.setData(t);
        }
        else{
            System.out.println("List is empty");
        }
    }
    public void setBack(T t){
        if(head != null){
            ListNode currentNode = head;
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            currentNode.setData(t);
        }
        else{
            System.out.println("LIst is empty");
        }
    }
    public void set(T t,int index){
        if(index == 0){
            setFront(t);
        }
        else if(index == length()-1){
            setBack(t);
        }
        else if(index >= length()-1){
            System.out.println("Invalid index");
        }
        else{
            ListNode currentNode = head;
            for(int i=1;i<=index;i++){
                currentNode = currentNode.getLink();
            }
            currentNode.setData(t);
        }
    }
    
    public T getFront(){
        if(head != null){
            return (T) head.getData();
        }
        else{
            return null;
        }
    }
    public T getBack(){
        if(head != null){
            ListNode currentNode = head;
            while(currentNode.getLink()!= null){
                currentNode = currentNode.getLink();
            }
            return (T) currentNode.getData();
        }
        else{
            return null;
        }
    }
    public T get(int index){
        if(index == 0){
            return getFront();
        }
        else if(index == length()-1){
            return getBack();
        }
        else if(index >= length()){
            return null;
        }
        else{
            ListNode currentNode = head;
            for(int i=1;i<=index;i++){
                currentNode = currentNode.getLink();
            }
            return (T) currentNode.getData();
        }
    }
}
