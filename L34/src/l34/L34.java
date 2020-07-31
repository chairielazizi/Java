/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l34;

import java.util.Random;

/**
 *
 * @author wif190047
 */
public class L34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int s1,s2,s3,s4,p1,p2;
        s1 = r.nextInt(6)+1;
        System.out.println("first round player 1:"+s1);
        s2 = r.nextInt(6)+1;
        System.out.println("second round player 1:"+s2);
        s3 = r.nextInt(6)+1;
        System.out.println("first round player 2:"+s3);
        s4 = r.nextInt(6)+1;
        System.out.println("second round player 2:"+s4);
        
        p1=s1+s2;
        p2=s3+s4;
        
        if (p1>p2){
            System.out.println("Player 1 wins.");
        }
        else if (p2>p1){
            System.out.println("Player 2 wins.");
        }
        else{
            System.out.println("Draw");    
        }
    }
    
}
