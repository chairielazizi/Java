package dsl4q2;

public class LinkedList<T extends Comparable<T>> {
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
            System.out.print(currentNode.toString());
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
    
    public void addSort(T t){
        if(head==null){
            addNode(t);
            return;
        }
        ListNode currentNode = head;
        ListNode previousNode = null;
        while(t.compareTo((T)currentNode.getData()) > 0){
            previousNode = currentNode;
            currentNode = currentNode.getLink();
            if(currentNode == null){
                break;
            }
        }
        ListNode newNode = new ListNode(t,head);
        if(previousNode == null){
            head = newNode;
        }
        else{
            previousNode.setLink(newNode);
        }
        newNode.setLink(currentNode);
//        if(currentNode ==null){
//            //previousNode = newNode;
//        }
    }
    
    public TwoLists splitList(){
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        
        for(int i=0;i<Math.round(size/2.0);i++){
            l1.addNode(get(i));
        }
        int temp = size/2;
        if(Math.round(size/2.0) != temp){
            temp++;
        }
        for(int i= temp;i<size;i++){
            l2.addNode(get(i));
        }
        return new TwoLists(l1,l2);
    }
    
    public TwoLists alternateList(){
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        
        for(int i=0;i<size;i++){
            if(i%2 ==0){
                l1.addNode(get(i));
            }
            else{
                l2.addNode(get(i));
            }
        }
        return new TwoLists(l1,l2);
    }
    public LinkedList mergeList(TwoLists t1){
        LinkedList result = new LinkedList();
        int s = t1.list1.size + t1.list2.size;
        int i,j,k;
        for(i=0,j=0,k=0;k<s && i<t1.list1.size && j<t1.list2.size;k++){
            if(k  % 2 ==0){
                result.addNode(t1.list1.get(i));
                i++;
            }
            else{
                result.addNode(t1.list2.get(j));
                j++;
            }
        }
        while(i<t1.list1.size){
            result.addNode(t1.list1.get(i));
            i++;
        }
        while(i<t1.list2.size){
            result.addNode(t1.list2.get(i));
            i++;
        }
        return result;
    }
    
    public Node splitList(Node list){
        if(list == null){
            return null;
        }
        Node runner = list.next;
        while(runner != null){
            runner = runner.next;
            if(runner == null){
                break;
            }
            runner = runner.next;
            list = list.next;
        }
        Node toReturn = list.next;
        list.next=null;
        return toReturn;
    }
}
