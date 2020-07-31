/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1718q2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Final1718Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter N number: ");
        int n = s.nextInt();
        int num[] = new int[n];
        
        for(int i=0;i<num.length;i++){
            num[i]= 50 + r.nextInt(101);
        }
        
        System.out.print("The random numbers are: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        
        int count3a=0,count2a=0,count1a=0;
        for(int i=0;i<num.length;i++){
           if(num[i]%10==0||num[i]%10==1||num[i]%10==2||num[i]%10==3)
               count3a++;
           else if(num[i]%10==4||num[i]%10==5||num[i]%10==6)
               count2a++;
           else if(num[i]%10==7||num[i]%10==8||num[i]%10==9)
               count1a++;
        }
        System.out.println("\nGroup AAA: "+count3a);
        System.out.println("Group AA: "+count2a);
        System.out.println("Group A: "+count1a);
    }
    
}
