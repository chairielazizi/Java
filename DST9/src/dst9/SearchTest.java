package dst9;

import java.util.Random;

public class SearchTest<T extends Comparable<T>> {
    private final int max = 100;
    private final int maxchar = 26;
    private T[] value;
    private int ordertype,size;
    private Random r;
    public static final int ascending=1;
    public static final int descending=2;
    
    public SearchTest(T t,int size){
        this.size=size;
        value = (T[]) new Comparable[size];
        r = new Random();
        char c;
        for(int i=0;i<size;i++){
            if(t instanceof Integer){
                value[i]=(T)(Integer)r.nextInt(max);
            }
            else if(t instanceof Double){
                value[i]=(T)(Double)(0.01*r.nextInt(max));
            }
            else if(t instanceof Character){
                c = (char)('A'+r.nextInt(maxchar));
                value[i]=(T)((Character) c);
            }
            else{
                c = (char)('A'+r.nextInt(maxchar));
                value[i]=(T)(c+"");
            }
        }
    }
    
    public SearchTest(int sortType,T t,int size){
        ordertype = sortType;
        this.size = size;
        value = (T[]) new Comparable[size];
        r = new Random();
        char c;
        for(int i=0;i<size;i++){
            if(t instanceof Integer){
                value[i]=(T) (Integer) r.nextInt(max);
            }
            else if(t instanceof Double){
                value[i]=(T)(Double)(0.01*r.nextInt(max));
            }
            else if(t instanceof Character){
                c = (char)('A'+r.nextInt(maxchar));
                value[i]=(T)((Character)c);
            }
            else{
                c = (char)('A'+r.nextInt(maxchar));
                value[i]=(T)(c+"");
            }
        }
    }
    
    public void showValue(){
        for(int i=0;i<value.length;i++){
            System.out.print(value[i]+" ");
            if((i+1)% 10 == 0){
                System.out.println();
            }
        }
    }
    
    public T getElement(int index){
        return value[index];
    }
    
    //true if found element
    public boolean contain(T t){
        boolean val=false;
        for(int i=0;i<value.length;i++){
            if(value[i].compareTo(t)==0){
                val=true;
            }
        }
        return val;
    }
    
    //list the index
    public void listIndex(){
        for(int i=0;i<value.length;i++){
            System.out.println("Index["+i+"]: "+value[i]+" ");
            if((i+1)% 10 == 0){
                System.out.println();
            }
        }
    }
    
    //return number occurence of elements
    public int linearSearchCount(T t){
        int count=0;
        for(int i=0;i<value.length;i++){
            if(value[i].compareTo(t)==0){
                count++;
            }
        }
        return count;
    }
    
    public boolean containRange(T begin,T end,T t){
        boolean val=false;
        for(int i=0;i<value.length;i++){
            if(value[i].compareTo(t)==0){
                val=true;
            }
//            if(t.compareTo(begin) and t.compareTo(end)){
//                
//            }
        }
        return val;
    }
    
    //Question2
    public int binarySearchCount(int begin,int end,T t){
        int middle = (begin + end) /2;
        if(end < begin){
            return -1;
        }
        if(value[middle].compareTo(t)==0){
            return middle;
        }
        else if((value[middle].compareTo(t)>0 && ordertype==ascending) || 
                (value[middle].compareTo(t)<0 && ordertype==descending)){
            return binarySearchCount(begin,middle - 1,t);
        }
        else{
            return binarySearchCount(middle + 1,end,t);
        }
    }
    public int binarySearchCount(T t){
        int kira=0;
        int index = binarySearchCount(0,value.length,t);
        if(index != -1){
            for(int i=index;i>=0 && t.compareTo(value[i])==0;i--){
                kira++;
            }
            for(int i=index+1;i<value.length && t.compareTo(value[i])==0;i++){
                kira++;
            }
        }
        return kira;
    }
    
    public void swap(int num1,int num2){
        T temp = value[num1];
        value[num1] = value[num2];
        value[num2] = temp;
    }
    public int getMinIndex(int begin){
        T temp = value[begin];
        int index = begin;
        for(int i=begin+1;i<value.length;i++){
            if(temp.compareTo(value[i])>0 && ordertype==ascending){
                index = i;
                temp = value[i];
            }
            else if(temp.compareTo(value[i])<0 && ordertype==descending){
                index=i;
                temp = value[i];
            }
        }
        return index;
    }
    public void selectionSort(int a){
        ordertype = a;
        for(int i=0;i<value.length;i++){
            swap(i,getMinIndex(i));
        }
    }
    
}
