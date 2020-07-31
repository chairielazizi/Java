/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q2;

import java.util.Scanner;

/**
 *
 * @author wif190007
 */
public class Lab2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double P,D,R,M;
        int Y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the price of the car:");
        P = s.nextDouble();
        System.out.println("Enter the down payment:");
        D = s.nextDouble();
        System.out.println("Enter the interest in %:");
        R = s.nextDouble();
        System.out.println("Enter the loan duration in year: ");
        Y = s.nextInt();
        
        M = (P-D)*(1+R*Y/100)/(Y*12);
        
        System.out.printf("The monthly payment of the car is %.2f",M);
        
        
    }
    
}
