/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl9q3;

import java.util.Scanner;

/**
 *
 * @author chairiel
 */
public class DSL9Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayHashTable<String,String> hash = new ArrayHashTable<>();
        String[] name = {"100-101","200-101","200-120","210-260"};
        String[] code = {"ICND 1","ICND 2","CCNA Routing and Switching","CCNA Security"};
        for(int i=0;i<name.length;i++){
            hash.put(name[i], code[i]);
        }
        System.out.println("The number of course is "+hash.getSize());
        hash.showHashTable();
        
        System.out.println("\nAdding a new course:");
        hash.put("300-101", "ROUTE");
        System.out.println("The number of course is "+hash.getSize());
        hash.showHashTable();
        
        System.out.println("\nModifying 210-260:");
        hash.put("210-260", "CCNA RS Security");
        System.out.println("The number of course is "+hash.getSize());
        hash.showHashTable();
        
        System.out.println("\nRemove the course 200-101:");
        hash.remove("200-101");
        System.out.println("The number of course is "+hash.getSize());
        hash.showHashTable();
        
        System.out.println("\nEnter a course code to search:");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Course "+input+" : "+hash.get(input));
    }
}
    

