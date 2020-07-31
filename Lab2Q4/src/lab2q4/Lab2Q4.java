/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q4;

import java.util.Scanner;

/**
 *
 * @author wif190007
 */
public class Lab2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int second,minute,hour;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        second = s.nextInt();
        
        minute = second/60;
        hour = minute/60;
        minute = minute%60;
        second = second%60;
        
        System.out.printf("It is %d hours, %d minutes and %d seconds\n",hour,minute,second);
    }
    
}
