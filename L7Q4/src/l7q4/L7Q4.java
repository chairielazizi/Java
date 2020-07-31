/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7q4;

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
public class L7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int countchar=0;
        int countword=0;
        int countline=0;
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream("test2.txt"));
            Scanner s = new Scanner(new FileInputStream("test.txt"));
            while(s.hasNextLine()){
                String input=s.nextLine();
                System.out.println(input);
                String sentence[]=input.split(" ");
                countword=countword+sentence.length;
                countchar=countchar+charcount(sentence);
                countline++;
                
                //count words
                /*
                for(int i=0;i<input.length();i++){
                    char ch=input.charAt(i);
                    if(ch==' '||ch==''){
                        countword++;
                    }
                }
                
                String word[]=input.split(" ");
                for(int i=0;i<word.length;i++){
                    countword+=word.length;
                    
                }
                */
            }
            System.out.println("The numbers of characters: "+countchar);
            System.out.println("The number of words: "+countword);
            System.out.println("The number of lines: "+countline);
            
            p.close();
            s.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    public static int charcount(String[]a){
        int counter=0;
        for(int i=0;i<a.length;i++){
            counter = counter+a[i].length();
        }
        return counter;
    }
    
}
