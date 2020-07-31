/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5q2;

import java.util.Random;

/**
 *
 * @author wif190007
 */
public class Lab5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        
        /*int[] number= new int[10];
        for(int i=0;i<number.length;i++){
            number[i]=r.nextInt(21);
            for(int j=0;j<number.length;j++){
                if(number[i]!=number[j]){
                System.out.print(number[j] + " ");
                }
            }
            System.out.print(number[i]+" ");
        }
        int[] num = new int[21];
        int n;
        
        for(int i=1;i<=10;){
            n = r.nextInt(21);
            if(num[i]==0){
                num[n]++;
                System.out.print(n+ " ");
                i++;
            }
        }
        System.out.println();
        */
        int N;
        final int MAX = 21;
        int[] numbers = new int[10];
        
        for (N=0; N<numbers.length; N++){
            numbers[N] = r.nextInt(MAX);
            for (int i=0; i<N; i++){
                if (numbers[N] == numbers[i]){
                    N--;
                    break;
                }
            }
        }
        
        System.out.println("The numbers are:");
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    
}
