package dst7;

public class ListNodeQ<T> {
    private T data;
    private ListNodeQ link;
    
    public ListNodeQ(){
        data = null;
        link = null;
    }
    
    public ListNodeQ(T a,ListNodeQ b){
        data = a;
        link = b;
    }
    
    public void setData(T a){
        data = a;
    }
    public T getData(){
        return data;
    }
    
    public void setLink(ListNodeQ a){
        link = a;
    }
    public ListNodeQ getLink(){
        return link;
    }
    
    public String toString(){
        return data + " --> ";
    }
}
