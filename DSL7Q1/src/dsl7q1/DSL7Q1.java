/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl7q1;

import java.util.Random;

/**
 *
 * @author user
 */
public class DSL7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr= new int [10];
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(21);
        }
        BST<Integer> tree = new BST<>();
        System.out.println("The random numbers are:");
        for(int i:arr){
            System.out.print(i+" ");
            //tree.addNode(i);
        }
        for(int i=0;i<arr.length;i++){
            tree.addNode(arr[i]);
        }
        System.out.print("\nThe number of elements in the tree:"+tree.getSize());
        
        System.out.println("The tree elements-PREORDER");
        tree.setOrder(BST.preorder);
        tree.showTree();
        System.out.println("\nThe tree elements-INORDER");
        tree.setOrder(BST.inorder);
        tree.showTree();
        System.out.println("\nThe tree elements-POSTORDER");
        tree.setOrder(BST.postorder);
        tree.showTree();
    }
    
}
