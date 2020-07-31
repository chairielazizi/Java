/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q7;

import java.util.Random;

/**
 *
 * @author wif190007
 */
public class Lab3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int n;
        n = 1 + r.nextInt(101);
        System.out.println(n);
        
        if(n%3==0){
            System.out.println("Fizz");
        }
        else if(n%5==0){
            System.out.println("Buzz");
        }
        else if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }
        else
            System.out.println("Not any number are multiple of 3 and 5");
    }
    
}
