/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q7;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DSL4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        String[] arr = sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        CircularLinkedList<String> list = new CircularLinkedList<>();
        System.out.println("\nThe words in the circular linked list:");
        for(int i=0;i<arr.length;i++){
            list.addCircularNode(arr[i]);
        }
        list.showCircularList();
        
        System.out.println("\nAfter delete a node");
        list.deleteCircularNode();
        list.showCircularList();
        
        System.out.println("\nThe second item in the list is ");
        System.out.println(list.getCircularItem(1)
);
    }
    
}
