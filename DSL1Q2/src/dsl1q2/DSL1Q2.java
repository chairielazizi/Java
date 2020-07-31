/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl1q2;

/**
 *
 * @author wif190007
 */
public class DSL1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double arr[] = {4.0,2.0,-0.5,-20.0};
       Polynomial p = new Polynomial(3,arr);
        System.out.println(p.toString());
        System.out.println(p.xvalue(2));
        
    }
    
}
