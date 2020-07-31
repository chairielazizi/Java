package dsfinalsem2_1617;

public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList(){
        head = null;
    }
    public void insertFirstLink(T a,int b){
        head = new ListNode(a,head);
        //System.out.println(head.getData());
    }
    public void addAfter(T a,T current,int c){
        ListNode currentNode = head;
        if(current.compareTo((T)head.getData())!=0){
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
                if(currentNode!=null && current.compareTo((T)currentNode.getData())==0){
                    break;
                }
                //currentNode = currentNode.getLink();
            }
        }
        ListNode newNode = new ListNode(a,null);
        while(currentNode.getLink()!=null){
            newNode.setLink(currentNode.getLink());
        }
        currentNode.setLink(newNode);
        System.out.println("Adding "+a+" after "+current);
    }
}
