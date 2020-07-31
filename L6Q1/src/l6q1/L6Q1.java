/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the triangular number: ");
        int num = s.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print(triangular(i) + " ");
        }
        
        
    }
    public static int triangular(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    
}
