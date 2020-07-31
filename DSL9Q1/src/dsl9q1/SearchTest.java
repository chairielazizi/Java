package dsl9q1;

import java.util.Random;
import java.util.Scanner;

public class SearchTest<T extends Comparable<T>> {
    public final int max = 100;
    public final int maxchar = 26;
    private T[][] value;
    private int ordertype;
    public static Scanner s = new Scanner(System.in);
    public static int size = s.nextInt();
    private Random r;
    
    public SearchTest(T t){
        this.size = size;
        r = new Random();
        value = (T[][]) new Comparable[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(t instanceof Integer){
                    value[i][j]=(T)(Integer)(r.nextInt(10)+10);
                }
                else if(t instanceof Double){
                    value[i][j]=(T)(Double)(0.01*(r.nextInt(10)+10));
                }
            }
        }
    }
    
    public void showValue(){
        for(int i=0;i<value.length;i++){
            for(int j=0;j<value[i].length;j++){
                System.out.print(value[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public boolean contain(T t){
        boolean val=false;
        for(int i=0;i<value.length;i++){
            for(int j=0;j<value[i].length;j++){
                if(value[i][j].compareTo(t)==0){
                    val = true;
                }
            }
        }
        return val;
    }
    
    public int linearSearchCount(T t){
        int count=0;
        for(int i=0;i<value.length;i++){
            for(int j=0;j<value[i].length;j++){
                if(value[i][j].compareTo(t)==0){
                    count++;
                }
            }
        }
        return count;
    }
    
    //search by range
    public int linearSearchCount(T t1,T t2){
        int count=0;
        for(int i=0;i<value.length;i++){
            for(int j=0;j<value[i].length;j++){
                if(value[i][j].compareTo(t1)>=0 && value[i][j].compareTo(t2)<=0){
                    count++;
                }
            }
        }
        return count;
    }
    
    //search the list location
    public int[][] linearSearchList(T t,int size){
        int[][] num = new int[size][size];
        for(int i=0;i<value.length;i++){
            for(int j=0,k=0;j<value[i].length;j++){
                if(value[i][j].compareTo(t)==0){
                    num[k][j]=i;
                    k++;
                }
            }
        }
        return num;
    }
    //search the locations of element
    public String linearSearchLocation(T t,int size){
        String input ="";
        int[][] num = new int[size][size];
        for(int i=0;i<value.length;i++){
            for(int j=0,k=0;j<value[i].length;j++){
                if(t.compareTo(value[i][j])==0){
                    //num[k][j]=i;
                    //k++;
                    input += "["+i+","+j+"]";
                }
            }
        }
        return input;
    }
    
    public String searchlocation(T t,T[][] matrix){
        String input = "";
        for(int i=0;i<value.length;i++){
            for(int j=0;j<value[i].length;j++){
                if(t.compareTo(matrix[i][j])==0){
                    System.out.print("["+i+","+j+"]");
                }
            }
        }
        return input;
    }
}
