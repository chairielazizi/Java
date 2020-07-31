/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q3;

import java.util.Scanner;



/**
 *
 * @author wif190007
 */
public class LAb3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double c1,c2,c3,c4;
        double sales;
        System.out.println("Enter sales volume: ");
        sales = s.nextDouble();
        
        if(sales<=100){
            c1 = sales * (5.0/100);
            c2 = 0;
            c3 = 0;
            c4 = 0;
        }
        else if(sales>100 && sales<=500){
            c1 = 100 * (5.0/100);
            c2 = (sales-100) * (7.5/100);
            c3=0;
            c4=0;
        }
        else if(sales>500 && sales<=1000){
            c1 = 100 * (5.0/100);
            c2 = (500-100) * (7.5/100);
            c3 = (sales - 500) * (10/100);
            c4 = 0;
        }
        else{
            c1 = 100 * (5.0/100);
            c2 = (500-100) * (7.5/100);
            c3 = (1000-500) * (10.0/100);
            c4 = (sales -1000) * (12.5/100);
        }
        double sum = c1 + c2 + c3 + c4;
        System.out.printf("The commission is %.2f\n",sum);
    }
    
}
