/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1617q3;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Final1617Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter an integer value: ");
        
        int n = s.nextInt();
        int array[]=new int[n];
       
        
        for(int i=0;i<array.length;i++){
            array[i]=r.nextInt(10000);
        }
        
        display(array);
        System.out.println();
        min(array);
        System.out.println("The approximation of the integer to the nearest hundred:");
        int round[]=new int[n];
        for(int i=0;i<array.length;i++){
            round[i]=array[i];
        }
        round(round);
        reverse(array);
    }
    public static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
    public static void min(int b[]){
        int min=b[0];
        for(int i=0;i<b.length;i++){
            if(b[i]<min){
                min=b[i];
            }
        }
        System.out.println("The minimum number is: "+min);
    }
    
    public static void reverse(int c[]){
        /*
        for(int i=0;i<c.length-1;i++){
            if(c[i]>c[i+1]){
                int temp=c[i];
                c[i]=c[i+1];
                c[i+1]=temp;
            }
        }
        for(int i:c)
            System.out.print(i+" ");
        */
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]+" ");
        }
        
    }
    
    public static void round(int[]a){
        for(int i=0;i<a.length;i++){
            a[i]=(int) (Math.round(a[i]/100.0)*100);
            System.out.print(a[i]+" ");
        }
        
    }
}
