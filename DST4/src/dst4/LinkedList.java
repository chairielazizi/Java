package dst4;

public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList(){
        head = null;
    }
    
    public int length(){
        int count = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public void clear(){
        head = null;
    }
    
    public boolean isEmpty(){
        return (head == null);
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
            head = newNode;
        }
        else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    
    public void deleteNode(){
        ListNode currentNode = head;
        ListNode previousNode = head;
        if(head != null){
            if(currentNode.getLink()==null){
                head = null;
            }
            else{
                while(currentNode.getLink() != null){
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                previousNode.setLink(null);
            }
        }
        else{
            System.out.println("The list is empty");
        }
    }
    
    public void hightwenty(){
        
        ListNode currentNode = head;
        while(currentNode != null){
            if((double)currentNode.getData()>20){
                ((double)currentNode.getData())+=10.5;
                
            }
        }
//        if((double)currentNode.getData()>20.0){
//            while(head != null){
//                
//            }
//        }
    }
    
}
