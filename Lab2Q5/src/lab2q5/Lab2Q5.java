/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q5;

import java.util.Random;

/**
 *
 * @author wif190007
 */
public class Lab2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random r = new Random();
       
       int n = r.nextInt(10001);
        System.out.println(n);
        
        int n1 = n%10;
        int i1 = n/10;
        int n2 = i1%10;
        int i2 = i1/10;
        int n3 = i2%10;
        int i3 = i2/10;
        int n4 = i3%10;
        int i4 = i3/10;
        int n5 = i4%10;
        int i5 = i4/10;
        
        int sum = n1+n2+n3+n4+n5;
        System.out.printf("The sum of digit is: %d\n",sum);
        
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//        System.out.println(n4);
//        System.out.println(n5);
//        System.out.println(n6);
//        System.out.println(n7);
//        System.out.println(n8);

        
        //int sum = n1+n2+n3+n4+n5;
        System.out.printf("The sum of digit is: %d\n",sum);
    
    }
    
}
