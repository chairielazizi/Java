/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3.pkg1;

import java.util.Scanner;

/**
 *
 * @author wif190047
 */
public class L31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first,second;
        
        System.out.println("Enter two integer number:");
        first=sc.nextDouble();
        second=sc.nextDouble();
        char operator;
        System.out.println("Enter the operator:");
        operator =sc.next().charAt(0);
        double result=0;
        switch(operator){
            case '+':
                result = first + second;
                System.out.println(result );
                break;
            case '-':
                result = first - second;
                System.out.println(result );
                break;
            case '/':
                result = first / second;
                System.out.println(result );
                break;
            case '*':
                result = first * second;
                System.out.println(result );
                break;
            case '%':
                result = first % second;
                System.out.println(result );
                break; 
            
                
        }
        
    }
    
}
