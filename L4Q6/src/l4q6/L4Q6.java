/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q6;

import java.util.Random;

/**
 *
 * @author user
 */
public class L4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int rand = r.nextInt(10000000) + 1;
        int count=0;
        System.out.println(rand);
        while(rand!=0){
            rand/=10;
            count++;
        }
        System.out.println("The number of digit is " + count);
        /*
        for(int i=10000000,j=1;i>0;i/=10,j++){
            
        }
        */
    }
    
}
