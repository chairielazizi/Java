/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer for the series: ");
        int n=s.nextInt();
        int sum=0,total=0;
        for(int i=1;i<=n;i++){
            sum+=i;//sum=sum+i
            total+=sum;//total=total+sum
        }
        System.out.println("The sum is "+ total);
    }
    
}
