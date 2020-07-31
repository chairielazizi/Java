package dsl8q1;

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
    private Random r;
    private int ordertype;
    
    
    public SortTest(int a,T t){
        ordertype=a;
        value=(T[]) new Comparable[size];
        r = new Random();
        char c;
        for(int i=0;i<size;i++){
            if(t instanceof Integer){
                value[i]=(T) (Integer) r.nextInt(size);
            }
            else if(t instanceof Double){
                value[i]=(T)(Double)(0.01 * r.nextInt(size));
            }
            else if(t instanceof Character){
                c = (char) ('A'+r.nextInt(maxchar));
                value[i]=(T)(Character)c;
            }
            else{
                c = (char)('A'+r.nextInt());
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
            System.out.print(value[i]+" ");
            if((i+1)%10 == 0){
                System.out.println();
            }
        }
    }
    
    public void merge(int leftfirst,int leftlast,int rightfirst,int rightlast){
        T[] temp=(T[]) new Comparable[size];
        int index=leftfirst;
        int currentindex=leftfirst;
        while((leftfirst<=leftlast) && (rightfirst<=rightlast)){
            if(value[leftfirst].compareTo(value[rightfirst])<0 && ordertype==ascending ||
                    value[leftfirst].compareTo(value[rightfirst])>0 && ordertype==descending){
                temp[index]=value[leftfirst];
                leftfirst++;
            }
            else{
                temp[index]=value[rightfirst];
                rightfirst++;
            }
            index++;
        }
        while(leftfirst<=leftlast){
            temp[index]=value[leftfirst];
            leftfirst++;
            index++;
        }
        while(rightfirst<=rightlast){
            temp[index]=value[rightfirst];
            rightfirst++;
            index++;
        }
        for(int i=currentindex;i<=rightlast;i++){
            value[i]=temp[i];
        }
    }
    
    public void mergeSort(int first,int last){
        if(first<last){
            int middle=(first+last)/2;
            mergeSort(first,middle);
            mergeSort(middle+1,last);
            merge(first,middle,middle+1,last);
        }
    }
    
    public void mergeSort(){
        mergeSort(0,value.length-1);
    }
}
