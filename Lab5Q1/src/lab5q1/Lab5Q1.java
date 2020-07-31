/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5q1;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wif190007
 */
public class Lab5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Random r =new Random();
        
        System.out.println("Enter the number of students: ");
        int n = s.nextInt();
        s.nextLine();
        int[] score = new int[n];
        for(int i=0;i<score.length;i++){
            score[i]= r.nextInt(101);
            System.out.println("The score is: " + score[i]);
        }
        int highest=0,lowest=score[0],sum=0;
        double average=0;
        for(int i=0;i<score.length;i++){
            if(score[i]>highest){
                highest=score[i];
            }
        }
        System.out.println("Highest score is: " + highest);
        
        for(int i=0;i<score.length;i++){
            if(score[i]<lowest || i==0){
                lowest=score[i];
            }
        }
        System.out.println("Lowest score is: " + lowest);
        
        for(int i=0;i<score.length;i++){
            sum+=score[i];
          
        }
        average=sum/(n);
        System.out.printf("Average score is: %.2f",average);
    }
    
}
