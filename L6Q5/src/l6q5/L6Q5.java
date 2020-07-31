/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class L6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int a =0;
        int num1,num2,num3;
        while(true){
            System.out.println("Enter negative number to quit.");
            num1=r.nextInt(13);
            num2=r.nextInt(13);
            System.out.print(num1 + "x" + num2 + "= ");
            num3=s.nextInt();
            a+=multiply(num1,num2,num3);
            System.out.println("score is "+a);
            
            if(num3<0){
                break;
            }
        }
        System.out.println("Your score is " + a);
    }
    public static int multiply(int a,int b,int c){
        int score=0;
        if(c == a*b){
            score+=1;
        }
        return score;
    }
}
