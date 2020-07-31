/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl9q2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DSL9Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        LinkedList<Integer> a = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(21);
        }
        for(int i=0;i<arr.length;i++){
            a.addNode(arr[i]);
        }
        a.showList();
        System.out.println("\nLinear Search");
        System.out.print("Enter a number to search: ");
        Scanner s = new Scanner(System.in);
        
        int val = s.nextInt();
        if(a.linearSearchContain(val)==true){
            System.out.println(val+" is found");
        }
        else{
            System.out.println(val+" is not found");
        }
        
        int count = a.linearSearchCount(val);
        if(count != 0){
            System.out.println("The number of "+val+" in the data set is "+count);
        }
        
        System.out.print("Enter two numbers to search (begin end):");
        int key1=s.nextInt();
        int key2=s.nextInt();
        if(a.linearSearchRange(key1, key2, val)==true){
            System.out.println("The integer can be found in between "+key1+" and "+key2);
        }
        else{
            System.out.println("The integer cannot be found in between "+key1+" and "+key2);
        }
        
        int countRange = a.linearSearchContainRange(key1, key2, val);
        if(countRange != 0){
            System.out.println("The number of the elements in between "+key1+" and "+key2+" in data set is "+count);
        }
    }
    
}
