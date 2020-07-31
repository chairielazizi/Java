/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hintfinaldrbadrul;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;


import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author user
 */
public class HintFinalDrBadrul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream("fake.txt"));
            Scanner input = new Scanner(new FileInputStream("original.txt"));
            while(input.hasNextLine()){
                String in = input.nextLine();
                System.out.println(in + " ");
                
                p.println(in);
                for(int i=0;i<in.length();i++){
                    
                    // p.println(in.charAt(i));
                }
            }
            p.close();
            input.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        
        Date d = new Date();
        long time = d.getTime();
        String timestamp = new SimpleDateFormat("yyyy.MM.dd").format(d);
        System.out.println(time);
        System.out.println(timestamp);
        
        System.out.println(d);
        System.out.println();
        String date ="01/04/2019 12:30:00 MYT";
        long millis = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss zzz").parse(date).getTime();
        System.out.println(millis);
        
        
    }
    
}
