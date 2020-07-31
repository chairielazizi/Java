/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1718sem2q2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Final1718Sem2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int bag = s.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        double kilo=s.nextDouble();
        
        double price =  kilo * bag *5.99;
        double pricewithtax= price + price * 0.0725;
        
        System.out.println("\nPrice per kilogram: $5.99");
        System.out.println("Sales tax: $7.25%");
        System.out.printf("Total price after tax: $%.2f\n",pricewithtax);
    }
    
}
