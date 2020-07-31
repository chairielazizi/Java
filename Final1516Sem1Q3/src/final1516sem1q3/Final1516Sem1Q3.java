/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1516sem1q3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Final1516Sem1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter the number of the random integer: ");
        int n = s.nextInt();
        int[]num = new int[n];
        
        System.out.print("The random integer: ");
        display(num);
        System.out.println();
        System.out.println("Maximum number : "+max(num));
        
        System.out.print("The approximation of the integer to the nearest tenth : ");
        //int[]temp=num;
        int[]roundoff=new int[n];
        for(int i=0;i<roundoff.length;i++)
        {
            roundoff[i]=num[i];
        }
        round(roundoff);
        /*
        for(int i=0;i<num.length;i++){
            System.out.print(round(i)+" ");
        }
        */
        System.out.println();
        System.out.print("The random integer in reverse mode: ");
        reverse(num);
    }
    
    public static void display(int[]a){
        Random r = new Random();
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt(1001);
            System.out.print(a[i]+" ");
        }
    }
    public static int max(int[]a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static void reverse(int[]b){
        for(int i=b.length-1;i>=0;i--){
            System.out.print(b[i]+" ");
        }
    }
    /*
    public static int round(int[]a){
        int round=0;
        for(int i=0;i<a.length;i++){
            round=(int) (Math.round(a[i]/10.0)*10);
            
        }
        return round;
    }
    */
    public static void round(int[]a){
        for(int i=0;i<a.length;i++){
            a[i]=(int) (Math.round(a[i]/10.0)*10);
            System.out.print(a[i]+" ");
            //a[i]=((a[i]+5)/10)*10
            //if num is int
        }
    }
}
