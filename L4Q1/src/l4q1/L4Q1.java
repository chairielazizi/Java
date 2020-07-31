/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = s.nextInt();

        System.out.print("The factor are: ");
        
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i + ", ");
            
        }
    }
    
}
