/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.util.Random;

/**
 *
 * @author user
 */
public class RevisionLabQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        String name = "ABCDEFGHIJKLMNOPQRDTUVWXYZ";
        
        char w1 = name.charAt(r.nextInt(27));
        System.out.println(w1);
        int n = r.nextInt(16);
        String num = String.valueOf(n);
        System.out.println(w1+num);
    }
    
}
