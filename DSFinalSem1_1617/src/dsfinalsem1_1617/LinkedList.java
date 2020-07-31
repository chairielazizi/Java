package dsfinalsem1_1617;

public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList(){
        head = null;
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
    public void add(T a){
        ListNode currentNode = head;
        ListNode newNode = new ListNode(a,null);
        if(head==null){
            head = newNode;
        }
        else{
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
        System.out.println("Adding : "+a);
    }
    public void addAfter(T a,T current){
        ListNode currentNode = head;
        if(current.compareTo((T)head.getData()) != 0){
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
                if(currentNode!=null & current.compareTo((T)currentNode.getData())==0){
                    break;
                }
            }
        }
        ListNode newNode = new ListNode(a,null);
        if(currentNode.getLink()!=null){
            newNode.setLink(currentNode.getLink());
        }
        currentNode.setLink(newNode);
        System.out.println("Adding "+a+" after "+current);
    }
    public void deleteFront(){
        System.out.println("Deleting front: "+head.getData());
        if(head!=null){
            head = head.getLink();
        }
        else{
            System.out.println("List is empty");
        }
    }
    public void deleteAfter(T a){
        ListNode currentNode = head;
        while(currentNode.getLink()!=null){
            if(a.compareTo((T)currentNode.getData())==0){
                break;
            }
            currentNode = currentNode.getLink();
        }
        System.out.println("Testting deletion after:");
        if(a.compareTo((T)currentNode.getData())!=0){
            System.out.println(a+" is not found");
        }
        else{
            System.out.println("After "+a+" is "+currentNode.getLink().getData()+". Deleting "+currentNode.getLink().getData());
            currentNode.setLink(currentNode.getLink().getLink());
        }
    }
    public void traverse(){
        ListNode currentNode = head;
        System.out.println("Showing the content of my LinkedList:");
        while(currentNode!=null){
            System.out.print(currentNode.toString().replace(" --> ", " "));
            currentNode = currentNode.getLink();
        }
        System.out.println();
    }
    
    /*
    public void addSort(T t){
        if(isEmpty()){
            addNode(t);
        }
        else{
            ListNode currentNodeBigger = head;
            if(t.compareTo((T)currentNodeBigger.getData())<0){
                addFrontNode(t);
            }
            else{
                ListNode currentNode = head;
                while(true){
                    if(currentNode.getLink()!=null){
                        if(t.compareTo((T)currentNode.getLink().getData())<0){
                            ListNode newNode = new ListNode(t,currentNode.getLink());
                            currentNode.setLink(newNode);
                            break;
                        }
                        else{
                            currentNode = currentNode.getLink();
                        }
                    }
                    else{// add last element
                        ListNode newNode = new ListNode(t,null);
                        currentNode.setLink(newNode);
                        break;
                    }
                }
            }
        }
    }
    */
}
