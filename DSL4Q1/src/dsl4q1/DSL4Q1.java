/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q1;

import java.util.Random;

/**
 *
 * @author user
 */
public class DSL4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();
        LinkedList<Integer> c = new LinkedList<>();
        Random r = new Random();
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(101);
        }
        System.out.print("The random number are : ");
        for(int i:arr){
            System.out.print(i + " ");
        }
        
        for(int i=0;i<arr.length;i++){
            a.addNode(arr[i]);
        }
        System.out.println("\n\nInsert at the back");
        a.showList();
        System.out.println();
        
        for(int i=0;i<arr.length;i++){
            b.addFrontNode(arr[i]);
        }
        System.out.println("\nInsert at the front");
        b.showList();
        System.out.println();
        
        for(int i=0;i<arr.length;i++){
            c.addSort(arr[i]);
        }
        System.out.println("Insert in a sorted list:");
        c.showList();
    }
    
}
