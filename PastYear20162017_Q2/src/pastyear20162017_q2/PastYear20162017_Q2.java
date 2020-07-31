/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear20162017_q2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PastYear20162017_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int count=0,min=10;
        System.out.println("Enter Integer [-1 to guit]: ");
       
        do{
            num = s.nextInt();
            if(num==-1)
                break;
            else{
                if(num>=1 && num<=9){
                    System.out.print(num + " ");
                    if(min>num){
                        min=num;
                        count=1;
                    }
                    else if(min==num){
                        count++;
                    }
                }
            }
        }while(num!=-1);
        if(min!=10){
        System.out.println();
        System.out.println("The minimum number is " + min);
        System.out.printf("The occurence of %d is %d\n",min,count);
        }
    }
    
}
