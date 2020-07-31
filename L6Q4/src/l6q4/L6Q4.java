/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the second number: ");
        int b = s.nextInt();
        System.out.println("The Greatest Common Divisor is: " + euclid(a,b));
    }
    
    public static int euclid(int num1,int num2){
        if(num2 == 0){
            return num1;
        }
        return euclid(num2,num1%num2);
    }
    
}
