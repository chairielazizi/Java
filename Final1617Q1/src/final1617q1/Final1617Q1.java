/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1617q1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Final1617Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        N = s.nextInt();
        System.out.println("The first " + N + " triangular numbers");
        for(int i=1;i<=N;i++){
            System.out.println(getTriangular(i)+" ");
            System.out.println();
        }
        
    }
    public static double getTriangular(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    
}
