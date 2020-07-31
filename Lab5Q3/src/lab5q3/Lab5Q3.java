/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5q3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wif190007
 */
public class Lab5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("Enter number of employee: ");
        int n = s.nextInt();
        s.nextLine();
        int[][] employee = new int[n][8];
        
        for(int i=0;i<employee.length;i++){
            for(int j=0;j<7;j++){
                employee[i][j]= r.nextInt(7)+1;
                employee[i][7]+= employee[i][j];
                        
            }
        }
        for(int i=0;i<employee.length;i++){
            for(int j=0;j<7;j++){
                System.out.println("For the " + (i+1) + "'s worker and day " + (j+1)+ " is "+ employee[i][j]);
                
            }
            System.out.println("The total hour is " + employee[i][7]);
            System.out.println();
        }
    }
    
}
