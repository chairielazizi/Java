/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q1;

import java.util.Scanner;

/**
 *
 * @author wif190007
 */
public class Lab3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter two integer number: ");
        Scanner s = new Scanner(System.in);
        int x,y;
        x = s.nextInt();
        y = s.nextInt();
        
        System.out.println("Enter the operator: ");
        char n;
        n = s.next().charAt(0);
        
        if(n=='+'){
            double sum = x + y;
            System.out.println("The sum is " + sum);
        }
        else if(n=='-'){
            double dif = x - y;
            System.out.println("The difference is " + dif);
        }
        else if(n=='*'){
            double multi = x* y;
            System.out.println("The product is " + multi);
        }
        else if(n=='/'){
            double div = x / y;
            System.out.println("The division is " + div);
        }
        else if(n=='%'){
            int mod = x % y;
            System.out.println("The modulo is " + mod);
        }
        else
            System.out.println("Invalid operator!!");
    }
    
}
