/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear20162017;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PastYear20162017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n;
        int sum=0;
        int digit;
        System.out.println("Enter nine digit integer: ");
        n = s.nextInt();
        
        //print 9 digit ISBN
        System.out.println("10-digit ISBN: ");
        for(int temp=n,j=1,i=100000000;i>0;i/=10,j++){
            digit = temp/i;
            System.out.print(digit);
            sum+= (digit * j);
            temp = temp % i;
            if(j==1 || j==4 || j==9){
                System.out.print("-");
            }
        }
        //print the last number
        digit = sum%11;
        if(digit==10){
            System.out.print("X");
        }
        else{
            System.out.println(digit);
        }
        /*
        for(int i=0;i<10;i++){
            sum = n[i]*n;
        }
        String num = String.valueOf(n);
        for(int j=0;j<10;j++){
            if(j==0){
                System.out.print(num.charAt(j)+"-");
            }
            else if(j>=1 && j<=3){
                System.out.print(num.charAt(j));
                if(j==3)
                    System.out.print("-");
            }
            else if(j>=4 && j<=8){
                System.out.print(num.charAt(j));
                if(j==8)
                    System.out.println("-");
            }
                
            
        }
        */
            
    }
    
}
