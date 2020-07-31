/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst3;

import java.util.Random;

/**
 *
 * @author user
 */
public class DST3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(100);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nThe minimum number is:");
        System.out.println(minimum(arr,arr.length));
        
        System.out.print("Sum of the array:");
        System.out.println(sum(arr,arr.length));
        
        System.out.print("Greater common between these 2 numbers is:");
        System.out.println(gcd(72,48));
        
        int n1=r.nextInt(100);
        System.out.print("The conversion from decimal to binary of "+n1);
        System.out.println(" is : "+binary(n1));
        
        int n2=r.nextInt(100);
        System.out.print("the sum of cubes of "+n2);
        System.out.println(" is : "+cubesum(n2));
    }
    
    //Q1a
    public static int minimum(int a[],int n){
        int num=0;
        if(n==1){
            return a[0];
        }
        else{
            num = minimum(a,n-1);
            if(a[n-1]<num){
                return a[n-1];
            }
            else
                return num;
        }
    }
    
    //Q1b
    public static double sum(int a[],int n){
        if(n<=0){
            return 0;
        }
        return (sum(a,n-1) + a[n-1]);
    }
    
    //Q1c
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        else{
            return gcd(y,x%y);
        }
    }
    
    //Q1d
    public static int binary(int decimal){
        if(decimal==0){
            return 0;
        }
        else{
            return (decimal % 2 + 10 * binary(decimal/2));
        }
    }
    /**
     * Question 1d
     * public void writeBinary(int n){
     * if(n==0||n==1){
     *  System.out.println(n);
     * }
     * else{
     *  writeBinary(n/2);
     *  System.out.println(n%2);
     * }
     * }
     * @param a
     * @return 
     */
    
    //Q1e
    public static int cubesum(int a){
        if(a==1){
            return 1 ;
        }
        else{
            return a*a*a + cubesum(a-1);
        }
    }
    
    //Q2
    public static int Acker(int m,int n){
        if(m==0){
            return n+1;
        }
        else if(n==0){
            return Acker(m-1,1);
        }
        else{
            return Acker(m-1,Acker(m,n-1));
        }
    }
    
    //Q3
    public void writeLine(char c,int n){
        if(n<=0){
            System.out.println();
        }
        else{
            System.out.println(c);
            writeLine(c,n-1);
        }
    }
    public void writeBlock(char c,int n,int l){
        if(n<=0){
            System.out.println();
        }
        else{
            System.out.println(c);
            writeBlock(c,n-1,l-1);
        }
    }
}
//Q4
//class StringLengthException extends Exception{
//    public StringLengthException(){
//        super("The length is longer than 12");
//    }
//    public StringLengthException(String s){
//        super(s);
//    }
//    String s ="yippe kayyo";
//    try{
//        if(s.length()>12){
//            throw new StringLengthException();
//        }
//    }
//    catch(StringLengthException e){
//                System.out.println(e.getMessage());
//                }
//}

