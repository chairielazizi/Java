package dsfinalsem1_1718;

public class Stack<T> {
    private ListNodes head;
    
    public Stack(){
        head = null;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public T peek(){
        if(isEmpty())
            return null;
        return (T)head.getData();
    }
    public void push(T a){
        System.out.println("Push item into stack: "+a);
        head = new ListNodes(a,head);
    }
    public T pop(){
        if(isEmpty())
            return null;
        T temp = (T)head.getData();
        head = head.getLink();
        return temp;
    }
    public void popAll(){
        while(!isEmpty()){
            pop();
        }
    }
    public void display(){
        ListNodes currentNode = head;
        while(currentNode!=null){
            System.out.println(currentNode.toString().replace(" <-- ", ""));
            currentNode = currentNode.getLink();
        }
        System.out.println();
    }
    public void displayReverse(){
        if(isEmpty())
            System.out.println("Stack is empty");
        Stack tempstack = new Stack();
        while(!isEmpty()){
            tempstack.push(pop());
        }
        while(!tempstack.isEmpty()){
            T t = (T) tempstack.pop();
            System.out.println(t);
            
            //push(t);
        }
    }
}

class ListNodes<T>{
    private T data;
    private ListNodes link;
    
    public ListNodes(){
        data = null;
        link = null;
    }
    public ListNodes(T a,ListNodes b){
        data = a;
        link = b;
    }
    public void setData(T a){
        data = a;
    }
    public T getData(){
        return data;
    }
    public void setLink(ListNodes a){
        link = a;
    }
    public ListNodes getLink(){
        return link;
    }
    public String toString(){
        return " <-- "+data;
    }
}