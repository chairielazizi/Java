/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q3;

import java.util.Random;

/**
 *
 * @author wif190007
 */
public class Lab2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        
        double n;
        double a = 10 + r.nextInt(41);
        double b = 10 + r.nextInt(41);
        double c = 10 + r.nextInt(41);
        double average = (a+b+c)/3;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.printf("The sum is %.2f\n",a+b+c);
        System.out.printf("The average is %.2f\n",average);
    }
    
}
