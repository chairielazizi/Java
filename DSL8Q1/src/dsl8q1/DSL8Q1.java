/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl8q1;

import java.util.Scanner;

/**
 *
 * @author chairiel
 */
public class DSL8Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N Special Random Number within 0-100: ");
        //int n = s.nextInt();
        SortTest<Integer> specialmerge = new SortTest<>(SortTest.ascending,1);
        //SortTest.size = s.nextInt();
        System.out.println("\nThe special number are:");
        specialmerge.showValue();
    }
    
}
