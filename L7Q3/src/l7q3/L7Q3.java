/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class L7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream("reverse.txt"));
            Scanner s = new Scanner(new FileInputStream("original.txt"));
            while(s.hasNextLine()){
                String input = s.nextLine();
                System.out.println(input+" ");
                for(int i=input.length()-1;i>=0;i--){
                    p.print(input.charAt(i));
                    System.out.print(input.charAt(i));
                }
            }
            s.close();
            p.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
}
