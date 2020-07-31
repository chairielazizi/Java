/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class L4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        /*
        int n = r.nextInt(101);
        int num=3;
        int flag=0;
        int i=0,j=0;
        System.out.println(n);
        System.out.print("2 ");
        
        
        
        while(i<n){
            flag = 0;
            for(i=2;i<num;i++){
                if(num%i==0){
                    flag = 1;
                }
            }
            if(flag==0){
                System.out.print(i +" ");
            }
            num++;
        }
        */
        System.out.println("Enter number:");
        int input=s.nextInt();
        int array[]=new int[input];
        for(int i=0;i<array.length;i++){
            array[i]=r.nextInt(1000);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=0;i<array.length;i++){
            System.out.println(prime(array[i])+" ");
            System.out.println(isprime(array[i])+" ");
        }
        
        
    }
    public static boolean prime(int a){
        int flag=0;
        if(a==1 || a==0){
            return false;
        }
        else{
            for(int i=2;i<a;i++){
                if(a%i==0){
                    flag=1;
                    break;
                }  
            }
        }
        if(flag==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isprime(int a){
        for(int i=2;2*i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
