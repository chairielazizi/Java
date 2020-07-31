/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl8q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author chairiel
 */
public class DSL8Q2 {

    /**
     * @param args the command line arguments
     */
    
    static String input;
    static String[] arr;
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(new FileInputStream("lab8q2.txt"));
            System.out.println("Reading data from product text file");
            while(s.hasNextLine()){
                input=s.nextLine();
                System.out.println(input);
                
            }
            arr=input.split(",");
            for(String i:arr){
                System.out.println(i);
            }
            //s.close();
            }catch(FileNotFoundException e){
                System.out.println("File is not found");
        }
    }
    
}
