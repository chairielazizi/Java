package dsl8q3;

import java.util.Random;

public class SortTest<T extends Comparable<T>> {
    public static final int ascending=1;
    public static final int descending=2;
    private final int size=10;
    private final int max=100;
    private final int maxchar=26;
    private T[] value;
    private int ordertype;
    private Random r;
    
    public SortTest(int a,T t){
        ordertype = a;
        value = (T[]) new Comparable[size];
        r = new Random();
        char c;
        for(int i=0;i<size;i++){
            if(t instanceof Integer){
                value[i]=(T)(Integer)r.nextInt(max);
            }
            else if(t instanceof Double){
                value[i]=(T)(Double)(0.01 * r.nextInt(max));
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
        T temp = value[num1];
        value[num1] = value[num2];
        value[num2] = temp;
    }
    
    public void showValue(){
        for(int i=0;i<value.length;i++){
            System.out.println(value[i]+" ");
            if((i+1)%10==0){
                System.out.println();
            }
        }
    }
    
    public int getMinIndex(int begin){
        T temp = value[begin];
        int index = begin;
        for(int i=begin+1;i<value.length;i++){
            if(temp.compareTo(value[i])>0 && ordertype==ascending){
                index=i;
                temp=value[i];
            }
            else if(temp.compareTo(value[i])<0 && ordertype==descending){
                index=i;
                temp=value[i];
            }
        }
        return index;
    }
    
    public void selectionSort(){
        for(int i=0;i<value.length-1;i++){
            swap(i,getMinIndex(i));
        }
    }
    
    public void bubbleSort(){
        for(int iteration=0;iteration<value.length;iteration++){
            for(int i=0;i<value.length;i++){
                if(value[i].compareTo(value[i+1])>0 && ordertype==ascending){
                    swap(i,i+1);
                }
                else if(value[i].compareTo(value[i+1])<0 && ordertype==descending){
                    swap(i,i+1);
                }
            }
        }
    }
    
    public void insertionSort(){
        int j;
        for(int i=1;i<value.length;i++){
            for(j=0;j<i;j++){
                if(value[i].compareTo(value[j])<0 && ordertype==ascending){
                    swap(i,j);
                    break;
                }
                else if(value[i].compareTo(value[j])>0 && ordertype==descending){
                    swap(i,j);
                    break;
                }
            }
            for(j=j+1;j<i;j++){
                swap(i,j);
            }
        }
    }
    
}
