/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l32;

import java.util.Random;

/**
 *
 * @author wif190047
 */
public class L32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int number;
        
        number=r.nextInt(6);
        System.out.println(number);
        
        switch(number){
            case (0):
                System.out.print("0 is zero");
                break;
            case (1):
                System.out.print("1 is one");
                break;    
            case (2):
                System.out.print("2 is two");
                break;
            case (3):
                System.out.print("3 is three");
                break;
            case (4):
                System.out.print("4 is four");
                break;
            case (5):
                System.out.print("5 is five");
                break;
            default:
                System.out.print("unkown");
                return;
        }
    }
    
}
