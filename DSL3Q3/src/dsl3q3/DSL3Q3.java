/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl3q3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DSL3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int num = s.nextInt();
        Random r = new Random();
        int[] element = new int[num];
        for(int i=0;i<element.length;i++){
            element[i] = r.nextInt(10);
        }
        for(int i:element){
            System.out.print(i);
        }
    }
    
    public static void permutation(){
        
    }
    
}
