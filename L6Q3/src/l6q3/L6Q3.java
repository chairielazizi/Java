/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class L6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int [] num = new int[10];
        
        for(int i=0;i<num.length;i++){
            num[i]=s.nextInt();
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+"");
        }
        System.out.println();
        reverse(num,num.length);
    }
    public static void reverse(int[]a,int n){
        int []b =new int[n];
        int j = n;
        for(int i=0;i<n;i++){
            b[j-1]=a[i];
            j=j-1;
        }
        
        for(int k=0;k<n;k++){
            System.out.print(b[k]);
        }
    }
    
}
