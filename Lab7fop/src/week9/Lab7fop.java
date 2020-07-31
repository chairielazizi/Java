/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lab7fop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("course.dat"));
            String code = "";
            code = s.nextLine();
            if(code == "wxes1116"){
                System.out.print(code + "Programming I");
            }
            else if(code == "wxes1115"){
                System.out.print(code + "Data Structure");
            }
            else if(code == "wxes1110"){
                System.out.print(code + "Operating System");
            }
            else if(code == "wxes1112"){
                System.out.print(code + "Computing Maths I");
            }
            out.writeChars(code);
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("course.dat"));
            String input = in.readLine();
            String input1 = in.readLine();
            System.out.println(input);
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
}
