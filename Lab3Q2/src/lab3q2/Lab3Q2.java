/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q2;

import java.util.Random;

/**
 *
 * @author wif190007
 */
public class Lab3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int x;
        x = r.nextInt(6);
        
        switch(x){
            case 0:
                System.out.println(x + " is zero");
            case 1:
                System.out.println(x + " is one");
                break;
            case 2:
                System.out.println(x + " is two");
                break;
            case 3:
                System.out.println(x + " is three");
                break;
            case 4:
                System.out.println(x + " is four");
                break;
            case 5:
                System.out.println(x + " is five");
                break;
        }
    }
    
}
