/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl9q5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author chairiel
 */
public class DSL9Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayHashTableChain<Integer,String> hash = new ArrayHashTableChain<>();
        try{
            Scanner sc = new Scanner(new FileInputStream("lab9q5.txt"));
            String input="";
            while(sc.hasNextLine()){
                input = sc.nextLine();
                hash.put(Integer.valueOf(input.substring(0, 5)), input.substring(6));
            }
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        hash.showHashTable();
        System.out.println("Hash Table using Hash Chain");
        System.out.println("The Hash Table size is "+ hash.getSize());
        System.out.print("Enter a PID to search: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        boolean data = hash.containsKey(input);
        
        if(data == true){
            System.out.println("Product ID : "+input+" "+ hash.get(input));
            System.out.println("The element in the same location are:");
            hash.printlocation(input);
        }
        else{
            System.out.println("Product ID "+input+" cannot be found");
        }
        
        
    }
    
}
