package dsfinalsem1_1819;

public class LinkedList<T extends Comparable<T>> {
    private Nodes head;
    //private int credit;
    
    public LinkedList(){
        head = null;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public void add(T a,int credit){
        Nodes newNode = new Nodes(a,credit,null);
        Nodes currentNode = head;
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
    public void addFirst(T a,int credit){
        Nodes newNode = new Nodes(a,credit,head);
        head = newNode;
    }
    public void addAfter(T a,T current,int credit){
        Nodes currentNode = head;
        while(currentNode.getLink()!=null){
            if(current.compareTo((T)currentNode.getData())==0){
                break;
            }
            else{
                currentNode = currentNode.getLink();
            }
        }
        Nodes newNode = new Nodes(a,credit,null);
        if(currentNode.getLink()!=null){
            newNode.setLink(currentNode.getLink());
        }
        currentNode.setLink(newNode);
    }
    public void deleteAfter(T a,int credit){
        
        Nodes currentNode = head;
        while(currentNode.getLink()!=null){
            if(a.compareTo((T)currentNode.getData())==0){
                break;
            }
            else{
                currentNode = currentNode.getLink();
            }
        }
        System.out.println("Removing "+currentNode.getLink().getData());
        if(currentNode.getLink()!=null){
            Nodes temp = currentNode.getLink();
            currentNode.setLink(temp.getLink());
            temp = null;
        }
        else{
            currentNode = null;
        }
    }
    public void display(){
        Nodes currentNode = head;
        while(currentNode!=null){
            System.out.println(currentNode.toString().replace(" --> ", ""));
            currentNode = currentNode.getLink();
        }
        System.out.println();
    }
    public void totalCreditHour(){
        
    }
}

class Nodes<T>{
    private T data;
    private Nodes link;
    protected int credit;
    
    public Nodes(){
        data = null;
        link = null;
        credit = 0;
    }
    public Nodes(T a,int c,Nodes b){
        data = a;
        credit =c;
        link = b;
    }
    public void setData(T a){
        data = a;
    }
    public T getData(){
        return data;
    }
    public void setLink(Nodes a){
        link = a;
    }
    public Nodes getLink(){
        return link;
    }
    public String toString(){
        return data +": "+credit+" hours"+ " --> ";
    }
}