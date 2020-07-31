/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2fop;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Lab2fop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Question 1
        System.out.print("Enter the temperature in fahrenheit: ");
        double c,f;
        Scanner s = new Scanner(System.in);
        f = s.nextDouble();
        c = (f-32)/1.8;
        System.out.printf("The temperature in celsius is %.2f\n", c);
        
        //Question 2
        double P,D,R,Y,M;
        System.out.println("Enter the price of the car:");
        P = s.nextDouble();
        System.out.println("Enter the down payment:");
        D = s.nextDouble();
        System.out.println("Enter the interest rate in %:");
        R = s.nextDouble();
        System.out.println("How many years of the loan's duration:");
        Y = s.nextDouble();
        
        M = (P -D)*(1 + R*Y/100)/(Y*12);
        System.out.printf("The monthly payment foor the car loan is %.2f\n",M);
        
        ///Question 3
        int i ;
        double sum=0;
        for(i=1;i<=3;i++){
            double x = (Math.random()*((50-10)+1)+10);
            System.out.printf("%.2f",x);
            
            sum = sum +x;
        }
        System.out.printf("The sum of three random numbers is %.2f\n",sum);
        System.out.printf("The average of the three numbers is %.2f\n",sum/3);
        
        //Question 4
        System.out.println("Enter the number of seconds: ");
        int seconds,minutes,hours;
        seconds = s.nextInt();
        
        minutes = seconds/60;
        hours = minutes/60;
        minutes = minutes % 60;
        seconds = seconds %60;
        
        System.out.println("123456 seconds is " + hours +"hours," + minutes + " minutes and " + seconds + "seconds");
        
        //Question 5
        double y = (Math.random()*((10000-0)+1)+0);
        
        //Question 6
        double m,q,f_initial,f_final,c1,c2;
        
        System.out.println("Enter the amount of water in gram:");
        m = s.nextDouble();
        System.out.println("Enter the intial temperature in Fahrenheit:");
        f_initial = s.nextDouble();
        System.out.println("Enter the final temperature in Fahrenheit:");
        f_final = s.nextDouble();
        
        m = m/1000;
        c1 = (f_initial-32) / 1.8;
        c2 = (f_final-32) / 1.8;
        q = m * ( c2 -c1) *4184;
         System.out.printf("The energy needed is %e\n",q);
    }
    
}
