/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l35;

import java.util.Scanner;

/**
 *
 * @author wif190047
 */
public class L35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,d,e,f,x,y;
        System.out.print("Enter a:");
        a=sc.nextDouble();
        System.out.print("Enter b:");
        b=sc.nextDouble();
        System.out.print("Enter c:");
        c=sc.nextDouble();
        System.out.print("Enter d:");
        d=sc.nextDouble();
        System.out.print("Enter e:");
        e=sc.nextDouble();
        System.out.print("Enter f:");
        f=sc.nextDouble();
        
        x = (e*d-b*f)/(a*d-b*c);
        y=(a*f-e*c)/(a*d-b*c);
        
        if ((a*d-b*c)==0){
            System.out.println("The equation has no solution");
        }
        else{
            System.out.println("x= "+x );
            System.out.println("y= "+y );
        }
            
    }
    
}
