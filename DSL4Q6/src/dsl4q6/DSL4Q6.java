/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q6;

import java.util.Random;

/**
 *
 * @author user
 */
public class DSL4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(100);
        }
        System.out.print("The random numbers are : ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        for(int i=0;i<arr.length;i++){
            list.addRightNode(arr[i]);
        }
        list.showList();
        System.out.println("\nRemove a number from the third position");
        list.deleteNodeByPosition(2);
        list.showList();
        
        System.out.println("\nReplace the number in seventh number with 999");
        list.deleteNodeByPosition(6);
        list.addNodeByPosition(999, 6);
        //list.deleteRightNode();
        list.showList();
        
        System.out.println("\nRemove all even number from doubly linked list:");
        list.removeEven();
        list.showList();
    }
    
}
