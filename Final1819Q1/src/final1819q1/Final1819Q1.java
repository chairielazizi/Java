/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1819q1;

import java.util.Random;

/**
 *
 * @author user
 */
public class Final1819Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This program shows the number of odd and even number from 10 random numbers.The random numbers must be from 0 - 100");
        int num,odd=0,even=0;
        Random r = new Random();
        for(int i=0;i<10;i++){
            num=r.nextInt(101);
            System.out.print(num + " ");
            if(isEven(num)){
                ++even;
            }
            else{
                ++odd;
            }
        }
        System.out.print("\nNumber of odd number: "+odd);
        System.out.println("\nNumber of even number: "+even);
        
    }
    
    public static boolean isEven(int a){
        if(a%2==0)
            return true;
        else
            return false;
    }
}
