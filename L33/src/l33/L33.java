/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l33;

import java.util.Scanner;

/**
 *
 * @author wif190047
 */
public class L33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("Enter sales volume:");
        a=sc.nextDouble();
        double c,c1,c2,c3;
        if (a>100){
            c = 0.05 * a;
            c1=0;
            c2=0;
            c3=0;
                       
        }
        else if (a>100 && a<=500){
            c = 0.05 * 100;
            c1 = ((a-100) * (0.075));
            c2=0;
            c3=0;
        }
        else if (a>500 && a<=1000){
            c = 0.05 * 100;
            c1 =0.075 * 500;
            c2= (a-500)* 0.1;
            c3=0;
        }
        else{
            c = 0.05 * 100;
            c1 =0.075 * 500;
            c2= 0.1 * 1000;
            c3=(a-1000) * 0.125;
        }
        double sum = c+c1+c2+c3;
        System.out.printf("The commission is %.2f",sum);
        
    }
    
}
