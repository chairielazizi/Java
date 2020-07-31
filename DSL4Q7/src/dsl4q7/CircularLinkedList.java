package dsl4q7;

public class CircularLinkedList<T> {
    private ListNode head;
    
    public CircularLinkedList(){
        head = null;
    }
    public int length(){
        int count=0;
        ListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
            if(head == currentNode){
                break;
            }
        }
        return count;
    }
    
    //insert at the back
    public void addCircularNode(T a){
        //ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        
        if(head==null){
            ListNode newNode = new ListNode(a,null);
            head = newNode;
            newNode.setLink(newNode);
        }
        else{
            while(currentNode.getLink() != head){
                currentNode = currentNode.getLink();
            }
            ListNode newNode = new ListNode(a,head);
            currentNode.setLink(newNode);
            //currentNode.getLink();
            //newNode.setLink(head);
            //newNode = new ListNode(a,head);
            
        }
    }
    
    //delete at the back
    public void deleteCircularNode(){
        ListNode currentNode = head;
        ListNode previousNode = head;
        
        if(head != null){
            if(currentNode.getLink() == null){
                head=null;
            }
            else{
                while(currentNode.getLink().getLink() != head){
                    //previousNode = currentNode;
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
            System.out.println("invalid index");
        }
        int count=0;
        while(currentNode.getLink() != head){
            if(index == length()){
                break;
            }
            currentNode = currentNode.getLink();
            count++;
        }
        return (T) currentNode.getData();
    }
}
