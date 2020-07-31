package dsl8q2;

import java.util.Random;

public class SortTest<T extends Comparable<T>> {
    public static final int ascending=1;
    public static final int descending=2;
    private final int size=10;
    private final int max=100;
    private final int maxchar=26;
    private T[] value;
    private Random r;
    private int ordertype;
    
    public SortTest(int a,T t){
        ordertype=a;
        value=(T[]) new Comparable[size];
        r = new Random();
        char c;
        for(int i=0;i<size;i++){
            if(t instanceof Integer){
                value[i]=(T)(Integer)r.nextInt(max);
            }
            else if(t instanceof Double){
                value[i]=(T)(Double)(0.01 * r.nextInt(size));
            }
            else if(t instanceof Character){
                c = (char)('A'+r.nextInt(maxchar));
                value[i]=(T)(Character)c;
            }
            else{
                c = (char)('A'+r.nextInt(maxchar));
                value[i]=(T)(c+" ");
            }
        }
    }
    
    public boolean isSorted(){
        for(int i=0;i<value.length;i++){
            if(value[i].compareTo(value[i+1])>0 && ordertype==ascending){
                return false;
            }
            else if(value[i].compareTo(value[i+1])<0 && ordertype==descending){
                return false;
            }
        }
        return true;
    }
    
    public void swap(int num1,int num2){
        T temp=value[num1];
        value[num1]=value[num2];
        value[num2]=temp;
    }
    
    public void showValue(){
        for(int i=0;i<value.length;i++){
            System.out.println(value[i]+" ");
            if((i+1)%10==0)
                System.out.println();
        }
    }
    
    public int split(int first,int last){
        boolean correctside;
        T splitvalue = value[first];
        int index=first;
        first++;
        do{
            correctside = true;
            while(correctside){
                if((splitvalue.compareTo(value[first])<0 && ordertype==ascending) ||
                        (splitvalue.compareTo(value[first])>0 && ordertype==descending)){
                    correctside=false;
                }
                else{
                    first++;
                    if(first<=last){
                        correctside=true;
                    }
                    else{
                        correctside=false;
                    }
                }
            }
            if(first<=last){
                correctside=true;
            }
            else{
                correctside=false;
            }
            while(correctside){
                if((splitvalue.compareTo(value[last])>=0 && ordertype==ascending)||
                        (splitvalue.compareTo(value[last])<0 && ordertype==descending)){
                    correctside=false;
                }
                else{
                    last--;
                    if(first<=last){
                        correctside=true;
                    }
                    else{
                        correctside=false;
                    }
                }
            }
            if(first<last){
                swap(first,last);
                first++;
                last--;
            }
        }while(first<=last);
        
        swap(index,last);
        return last;
    }
}
