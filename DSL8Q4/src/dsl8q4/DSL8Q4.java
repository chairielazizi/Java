/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl8q4;

/**
 *
 * @author chairiel
 */
public class DSL8Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter N characters: ");
        SortTest<Character> heap = new SortTest(SortTest.ascending,'A');
        System.out.println("The characters are: ");
        heap.showValue();
    }
    
}
