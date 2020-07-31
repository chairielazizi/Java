/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l36;

import java.util.Scanner;

/**
 *
 * @author wif190047
 */
public class L36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double radius;
        System.out.println("Enter radius:");
        radius=sc.nextDouble();
        int x,y;
        System.out.println("Enter x:");
        x=sc.nextInt();
        System.out.println("Enter y:");
        y=sc.nextInt();
        
        if (((radius*radius) >= (x*x))&&((radius*radius) >= (y*y))){
          System.out.println("The point is inside the circle centered at (0,0)");
        }
        else {
          System.out.println("The point is outside the circle centered at (0,0)");   
        }
    }
    
}
