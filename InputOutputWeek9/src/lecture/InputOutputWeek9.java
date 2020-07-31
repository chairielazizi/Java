/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class InputOutputWeek9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        /*
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream("integer.txt"));
            for(int i=0;i<10;i++){
                p.print(r.nextInt(1001) + " ");
            }
            p.close();
            }catch(IOException e){
                    System.out.println("Problem with file output");
                    }
        try{
            Scanner s = new Scanner(new FileInputStream("integer.txt"));
            //String input = s.nextLine();
            //System.out.println(input);
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
            s.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        */
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("integer.dat"));
            for(int i=0;i<10;i++){
                out.writeInt(r.nextInt(1001));
            }
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("integer.dat"));
            int sum=0;
            double average;
            try{
                while(true){
                int num = in.readInt();
                sum+=num;
                System.out.println(num);
                }
            }catch(EOFException e){
                    
                    }
            average = sum/10.0; 
            System.out.println("Average is " + average);
            in.close();
            }catch(FileNotFoundException e){
                 
            }catch(IOException e){
            
            }
        //Tutorial 7 Q3
        
        try{
            PrintWriter printer = new PrintWriter(new FileOutputStream("binary.txt"));
            String text ="";
            text = s.nextLine();
            String result="";
            
            char[] binary = text.toCharArray();
            for(int i=0;i<binary.length;i++){
                result += Integer.toBinaryString(binary[i]) + " ";
            }
            printer.print(result);
            printer.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        try{
            Scanner sc = new Scanner(new FileInputStream("binary.txt"));
            String input = sc.nextLine();
            System.out.println(input);
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        
        
        
        
        
        try{
            PrintWriter printer = new PrintWriter(new FileOutputStream("binary.txt"));
            String text ="";
            text = s.nextLine();
            String result="",tmpstr;
            int integer;
            char[] binary = text.toCharArray();
            
            for(int i=0;i<binary.length;i++){
                tmpstr=Integer.toBinaryString(binary[i]);
                integer = tmpstr.length();
                if(integer!=8){
                    integer = 8 -integer;
                    if(integer==8){
                        result+=tmpstr;
                    }
                    else if(integer>0){
                        for(int j=0;j<integer;j++){
                            result+= "0";
                        }
                    }
                    result+=tmpstr;
                }
                result += " "; 
            }
            printer.print(result);
            printer.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        try{
            Scanner sc = new Scanner(new FileInputStream("binary.txt"));
            String input = sc.nextLine();
            System.out.println(input);
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        }
       
    }
    

