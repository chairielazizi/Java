/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q6;

import java.util.Scanner;

/**
 *
 * @author wif190007
 */
public class Lab2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Q,M,initialTemp,finalTemp,c1,c2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount of water in gram:");
        M = s.nextDouble();
        System.out.println("Enter the initial temperature in fahrenheit:");
        initialTemp = s.nextDouble();
        System.out.println("Enter the final temperature in fahrenheit:");
        finalTemp = s.nextDouble();
        
        M = M/1000;
        c1 = (initialTemp -32)/1.8;
        c2 = (finalTemp -32)/1.8;
        
        Q = M *(c2-c1)* 4184;
        System.out.printf("The energy needed is %e\n",Q);
    }
    
}
