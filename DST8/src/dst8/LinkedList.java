package dst8;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList(){
        head=null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void clear(){
        head=null;
    }
    public int length(){
        int count=0;
        ListNode currentNode = head;
        while(currentNode!=null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    public void showList(){
        ListNode currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    public void addNode(T a){
        ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        if(head==null){
            
        }
    }
}
