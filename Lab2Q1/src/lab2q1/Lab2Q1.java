/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q1;
import java.util.Scanner;
/**
 *
 * @author wif190007
 */
public class Lab2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the temperature in fahrenheit:");
        
        double f,c;
        Scanner s = new Scanner(System.in);
        f = s.nextDouble();
        
        c = (f-32)/1.8;
        System.out.printf("The temperature in celcius is %.2f\n",c);
        
        
    }
    
}
