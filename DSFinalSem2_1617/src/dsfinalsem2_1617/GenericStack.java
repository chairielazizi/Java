package dsfinalsem2_1617;

import java.util.ArrayList;

public class GenericStack<T> implements StackInterface {
    ArrayList<T> list;
    public GenericStack(){
        list = new ArrayList<>();
    }
    
    public int getSize(){
        return list.size();
    }
    public T peek(){
        return list.get(getSize()-1);
    }
    public T pop(){
        T t = list.get(getSize()-1);
        list.remove(t);
        return t;
    }
    public void push(Object a) {
        list.add((T) a);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public String toString(){
        return "Stack: "+list.toString();
    }

    @Override
    public GenericStack constructor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
