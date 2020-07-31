/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl3q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DSL3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream("data.txt"));
            pw.println("We are only eleven");
            pw.close();
            
            Scanner sc = new Scanner(new FileInputStream("data.txt"));
            while(sc.hasNextLine()){
                String input = sc.nextLine();
                System.out.print(input+" ");
            }
            
            Scanner k = new Scanner("data.txt");
            reverse(k);
            reverseprint(k);
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    
    public static void reverse(Scanner s) throws FileNotFoundException{
        String k = s.nextLine();
        if(s.hasNextLine()){
            reverse(s);
            System.out.println(k+" ");
        }
    }
    
    public static void reverseprint(Scanner s) throws FileNotFoundException{
        if(!s.hasNextLine()){
            return;
        }
        String k = s.nextLine();
        System.out.println(k);
        reverseprint(s);
    }
    
}
