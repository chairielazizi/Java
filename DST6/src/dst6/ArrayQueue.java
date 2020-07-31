package dst6;
interface Array<T>{
    public boolean isEmpty();
    public boolean isFull();
    public int getSize();
    public void enqueue(T a);
    public T dequeue();
    public T peek();
    public void showQueue();
}
public class ArrayQueue<T> implements Array<T> {
    private T[] queue;
    //private int index;
    private final int max = 10;
    private int front,rear,size;
    
    public ArrayQueue(){
        front =0;
        rear = 0;
        size = 0;
        queue = (T[]) new Object[max];
    }
    
    public boolean isEmpty(){
        return (size == 0);
    }
    
    public boolean isFull(){
        return (size == max);
    }
    
    public int getSize(){
        return size;
    }
    
    public void enqueue(T a){
        if(!isFull()){
            queue[rear] = a;
            rear++;
            size++;
        }
        else{
            System.out.println("The queue is full");
        }
    }
    public T dequeue(){
        if(isEmpty())
            return null;
        T t = queue[front];
        front = ++front % max;
        size--;
        return t;
    }
    
    public T peek(){
        if(isEmpty())
            return null;
        return queue[front];
    }
    
    public void showQueue(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }
        else{
            for(int i=0;i<size;i++){
                System.out.print(queue[front+i%max]+" --> ");
            }
        }
    }
}
