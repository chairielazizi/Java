/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n;
        int min=0,max=0;
        double average=0,std=0;
        double sum=0;
        int k=0;
        
        /*System.out.print("Enter a score[negative number to quit]: ");
            n = s.nextInt();
            sum+=n;
            k++;
        */
        
        for(int i=1;i<=100;i++){
            System.out.print("Enter a score[negative number to quit]: ");
            n = s.nextInt();
            if(n>0){
            sum+=n;
            k++;
                if(n<min || i==1)
                    min=n;
                if(n>max || i==1)
                    max=n;
            }
            else{
                //System.out.println("You did not enter a number.");
                break;
            }
        }
        System.out.println(sum);
        System.out.println("Mininum number: " + min);
        System.out.println("Maximum number: " + max);
        average = (double)sum/(double)k;
        System.out.println("Average score: " + average);
        
        /*
        do{
            System.out.print("Enter a score[negative number to quit]: ");
            n = s.nextInt();
            sum+=n;
            k++;
            if(min<n)
                min=n;
            if(max>n)
                max=n;
        }while(n>0);
        
        average = sum/(k*1.0);
        
        System.out.println(sum);
        System.out.println("Mininum number: " + min);
        System.out.println("Maximum number: " + max);
        //average = (double)sum/(double)k;
        System.out.println("Average score: " + average);
        */
    }
}

    

