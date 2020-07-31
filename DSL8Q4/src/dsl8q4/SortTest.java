package dsl8q4;

import java.util.Random;
import java.util.Scanner;

public class SortTest<T extends Comparable<T>> {
    public static Scanner s = new Scanner(System.in);
    public static final int ascending = 1;
    public static final int descending = 2;
    public static int size = s.nextInt();
    private final int max = 100;
    private final int maxchar = 26;
    private T[] value;
    private int ordertype;
    private Random r;
    
    public SortTest(int a,T t){
        ordertype = a;
        r = new Random();
        value =(T[]) new Comparable[size];
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
                value[i]=(T)(Character)c;
            }
            else{
                c = (char)('A'+r.nextInt(maxchar));
                value[i]=(T)(c +" ");
            }
        }
    }
    
    public boolean isSorted(){
        boolean sorted=true;
        for(int i=0;i<value.length;i++){
            if(value[i].compareTo(value[i+1])>0 && ordertype==ascending){
                sorted=false;
            }
            else if(value[i].compareTo(value[i+1])<0 && ordertype==descending){
                sorted=false;
            }
        }
        return sorted;
    }
    
    public void swap(int num1,int num2){
        T temp = value[num1];
        value[num1] =value[num2];
        value[num2] = temp;
    }
    
    public void showValue(){
        for(int i=0;i<value.length;i++){
            System.out.print(value[i]+" ");
            if((i+1)%10==0){
                System.out.println();
            }
        }
    }
    
    public void heapify(int begin){
        int leftchild = 2*begin+1;
        int rightchild = 2*begin+2;
        int largest = (Integer) value[begin];
        
        if(leftchild < value.length && value[leftchild].compareTo(value[largest])>0){
            largest=leftchild;
        }
        if(rightchild<value.length && value[rightchild].compareTo(value[largest])>0){
            largest=rightchild;
        }
        if(largest != begin){
            int temp = (Integer)value[begin];
            value[begin]=value[largest];
            //value[largest]=(Integer)temp;
        }
    }
    
}
