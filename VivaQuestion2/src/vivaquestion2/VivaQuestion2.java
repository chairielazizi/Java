/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivaquestion2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class VivaQuestion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        //int n = r.nextInt(1000);
        int n = s.nextInt();
        
        int a = n/100;
        int x = n%100;
        int b = x/10;
        int c = x%10;
        
        if(n>=100 && n<1000){
            
        switch(a){
            case 1:System.out.print(n + " is One hundred ");
            break;
            case 2:System.out.print(n + " is Two hundred ");
            break;
            case 3:System.out.print(n + " is Three hundred ");
            break;
            case 4:System.out.print(n + " is Four hundred ");
            break;
            case 5:System.out.print(n + " is Five hundred ");
            break;
            case 6:System.out.print(n + " is Six hundred ");
            break;
            case 7:System.out.print(n + " is Seven hundred ");
            break;
            case 8:System.out.print(n + " is Eight hundred ");
            break;
            case 9:System.out.print(n + " is Nine hundred ");
            break;
        }
        switch(b){
            case 2:System.out.print(" and twenty");
            break;
            case 3:System.out.print(" and thirty");
            break;
            case 4:System.out.print(" and forty");
            break;
            case 5:System.out.print(" and fifty");
            break;
            case 6:System.out.print(" and sixty");
            break;
            case 7:System.out.print(" and seventy");
            break;
            case 8:System.out.print(" and eighty");
            break;
            case 9:System.out.print(" and ninety");
            break;
        }
        if(x>=11 && x<=19){
            switch(x){
            case 11:System.out.println(" and Eleven");
            break;
            case 12:System.out.println(" and Twelve");
            break;
            case 13:System.out.println(" and Thirteen");
            break;
            case 14:System.out.println(" and Fourteen");
            break;
            case 15:System.out.println(" and Fifteen");
            break;
            case 16:System.out.println(" and Sixteen");
            break;
            case 17:System.out.println(" and Seventeen");
            break;
            case 18:System.out.println(" and Eighteen");
            break;
            case 19:System.out.println(" and Nineteen");
            break;
        }
        }
        else{
        switch(c){
            case 1:System.out.print("-one");
            break;
            case 2:System.out.print("-two");
            break;
            case 3:System.out.print("-three");
            break;
            case 4:System.out.print("-four");
            break;
            case 5:System.out.print("-five");
            break;
            case 6:System.out.print("-six");
            break;
            case 7:System.out.print("-seven");
            break;
            case 8:System.out.print("-eight");
            break;
            case 9:System.out.print("-nine");
            break;
        }
        }
            }
        if(n>=20 && n<=100){
            switch(b){
            case 2:System.out.print(n+" is Twenty");
            break;
            case 3:System.out.print(n+" is Thirty");
            break;
            case 4:System.out.print(n+" is Forty");
            break;
            case 5:System.out.print(n+" is Fifty");
            break;
            case 6:System.out.print(n+" is Sixty");
            break;
            case 7:System.out.print(n+" is Seventy");
            break;
            case 8:System.out.print(n+" and Eighty");
            break;
            case 9:System.out.print(n+" and Ninety");
            break;
        }
        
        switch(c){
            case 1:System.out.print("-one");
            break;
            case 2:System.out.print("-two");
            break;
            case 3:System.out.print("-three");
            break;
            case 4:System.out.print("-four");
            break;
            case 5:System.out.print("-five");
            break;
            case 6:System.out.print("-six");
            break;
            case 7:System.out.print("-seven");
            break;
            case 8:System.out.print("-eight");
            break;
            case 9:System.out.print("-nine");
            break;
        }
        }
        if(n>=0 && n<=19){
        switch(n){
            case 0:System.out.println(n + " Zero");
            break;
            case 1:System.out.println(n + " One");
            break;
            case 2:System.out.println(n + " Two");
            break;
            case 3:System.out.println(n + " Three");
            break;
            case 4:System.out.println(n + " Four");
            break;
            case 5:System.out.println(n + " Five");
            break;
            case 6:System.out.println(n + " Six");
            break;
            case 7:System.out.println(n + " Seven");
            break;
            case 8:System.out.println(n + " Eight");
            break;
            case 9:System.out.println(n + " Nine");
            break;
            case 10:System.out.println(n + " Ten");
            break;
            case 11:System.out.println(n + " Eleven");
            break;
            case 12:System.out.println(n + " Twelve");
            break;
            case 13:System.out.println(n + " Thirteen");
            break;
            case 14:System.out.println(n + " Fourteen");
            break;
            case 15:System.out.println(n + " Fifteen");
            break;
            case 16:System.out.println(n + " Sixteen");
            break;
            case 17:System.out.println(n + " Seventeen");
            break;
            case 18:System.out.println(n + " Eighteen");
            break;
            case 19:System.out.println(n + " Nineteen");
            break;
        }
        }
    }   
        
    
    }

