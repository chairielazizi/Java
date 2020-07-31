/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl9q1;

import java.util.Scanner;

/**
 *
 * @author chairiel
 */
public class DSL9Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter N : ");
        SearchTest<Integer> search = new SearchTest<>(1);
        System.out.println("The matrix are: ");
        search.showValue();
        System.out.println("\nLinear Search");
        System.out.println("Enter a number to search: ");
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        int count = search.linearSearchCount(val);
        if(count!=0){
            System.out.println(val+" is found");
            System.out.println("The occurence of "+val+" is "+count);
            System.out.println("The location of "+val+" is : "+search.linearSearchLocation(val, SearchTest.size));
        }
        else{
            System.out.println(val+" is not found");
        }
        
        /*
        int[][] location = search.linearSearchList(val,count);
        System.out.println("The location of "+val+" are:");
        for(int i=0;i<count;i++){
            for(int j=0;j<count-1;j++){
                System.out.print(location[i][j]+" ");
            }
            System.out.println();
        }
        */  
    }
    
}
