/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1718q1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Final1718Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        Scanner s = new Scanner(System.in);
        int num,sum=0;
        do{
            System.out.println("Enter an integer number, -1 to quit:");
            num = s.nextInt();
            if(num==-1)
                break;
            else if(num%2==0)
                System.out.println("The number is an even number");
            else
                System.out.println("The number is an odd number");
            sum+=num;
        }while(num!=1);
        System.out.printf("The sum of all integer number(s) is %5d\n",sum);
    }
    
}
