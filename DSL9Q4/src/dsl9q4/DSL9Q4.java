/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl9q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author chairiel
 */
public class DSL9Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayHashTableHashing<Integer,String> hashing = new ArrayHashTableHashing<>();
        try{
        Scanner sc = new Scanner(new FileInputStream("lab9q4.txt"));
        String input;
        while(sc.hasNextLine()){
            input = sc.nextLine();
            //System.out.println(input);
            hashing.put(Integer.valueOf(input.substring(0, 5)), input.substring(6));
        }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        //hashing.put(123, "nasi goreng");
        System.out.println("The data set in the table:");
        hashing.showHashTable();
        System.out.println("The hash table size is: "+hashing.getSize());
        
        System.out.println("\nEnter a PID to search:");
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        boolean found = hashing.containsKey(val);
        if(found==true){
            System.out.println("Product ID: "+val+" "+hashing.get(val));
            System.out.println("Location:"+hashing.location(val));
        }
        else{
            System.out.println("Product ID "+val+" is not found");
        }
    }
}